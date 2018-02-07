package com.zhou.jdshop.search.web;

import com.zhou.jdshop.pojo.po.TbProduct;
import com.zhou.jdshop.pojo.vo.Cart;
import com.zhou.jdshop.pojo.vo.CartItem;
import com.zhou.jdshop.pojo.vo.CartOne;
import com.zhou.jdshop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ShoppingCartPortalAction {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Autowired
//    private OrderService orderService;

//    @Autowired
    @Resource
    private ProductService productService;

    /*{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dubbo-consumer.xml");
        context.start();
        productService=(ProductService)context.getBean("productService");
    }*/

    /**
     * 增加商品到购物车，EL表达式，1.0版本
     * @param pid，商品ID
     * @param count，商品数量
     * @return
     */
    @RequestMapping("/addProductToCart")
    public String addProductToCart(@RequestParam("pid") Long pid, @RequestParam("count") int count, HttpSession session, HttpServletResponse response){

        try{
//            System.out.println(pid+" "+count);

            //根据pid去查找商品对象
            TbProduct p = productService.getProductById(pid);

            //从Session里面取出购物车
            //购物车  有可能等于null
            Cart cart = (Cart) session.getAttribute("cart");

            /**
             * 如果购物车==null   new Cart();
             */
            if(cart==null){
                cart=new Cart();
            }

            //把购物项放到购物车里
            Map<Long, CartItem> map = cart.getItems();//获得购物项容器

            /**
             * 创建购物项对象
             */
            CartItem item=new CartItem();//准备空的购物项

            /**
             * 如果不是第一次购买该商品
             */
            if(map.containsKey(pid)){
                //从购物车里取出key值是pid的购物项
                item = map.get(pid);//购物项
                //数量+buyNym
                item.setCount(item.getCount()+count);
                //新的小记
                item.setSubTotal(item.getSubTotal()+p.getShopPrice()*count);
                //map.put(pid,item);

            }else{
                /**
                 * 第一个购买该商品
                 */
                item.setCount(count);//购买数量
                item.setProduct(p);//商品
                item.setSubTotal(count*p.getShopPrice());//小计

            }
            //把购物项放到购物车里
            map.put(pid,item);

            /**
             * 总计
             */
            cart.setTotal(cart.getTotal()+count*p.getShopPrice());//变多~~~

            /**
             * 把购物车放到session里
             */
            session.setAttribute("cart", cart);
            session.setMaxInactiveInterval(15*24*3600);

            Cookie cookie=new Cookie("JSESSIONID",session.getId());
            cookie.setMaxAge(15*24*3600);
            response.addCookie(cookie);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();

        }
        //重定向到cart.jsp
        return "redirect:shoppingcart";
    }


    /**
     * 从购物车删除商品，没用ajax，1.0版本
     * @param pid
     * @param session
     * @return
     */
    @RequestMapping("/deleteProductFromCart")
    public String deleteProductFromCart(@RequestParam("pid") Long pid,HttpSession session, HttpServletResponse response){

        try{
//            System.out.println(pid+" ");

            //取出购物车
            Cart cart = (Cart) session.getAttribute("cart");

            if(cart!=null){
                //取出map
                Map<Long, CartItem> map = cart.getItems();
                if(map.containsKey(pid)){
                    CartItem cartItem = map.get(pid);
                    map.remove(pid);//根据key把这个购物项对象删除

                    //重新计算总计
                    cart.setTotal(cart.getTotal()-cartItem.getSubTotal());

                }
            }
            session.setAttribute("cart", cart);
            session.setMaxInactiveInterval(15*24*3600);

            Cookie cookie=new Cookie("JSESSIONID",session.getId());
            cookie.setMaxAge(15*24*3600);
            response.addCookie(cookie);



        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();

        }
        //重定向到购物车界面
        return "redirect:shoppingcart";
    }

    @RequestMapping(value="/addProductOneToCart",method = RequestMethod.POST)
    @ResponseBody
    public CartOne addProductOneToCart(@RequestParam("pid") Long pid, HttpSession session, HttpServletResponse response){

        CartOne cartOne = new CartOne();
        try{
//            System.out.println(pid+" ");

            //取出购物车
            Cart cart = (Cart) session.getAttribute("cart");

            if(cart!=null){
                //取出map
                Map<Long, CartItem> map = cart.getItems();
                if(map.containsKey(pid)){
                    CartItem cartItem = map.get(pid);

//                    System.out.println(cartItem.getCount());
                    cartItem.setCount(cartItem.getCount()+1);
//                    System.out.println(cartItem.getCount());

                    cartItem.setSubTotal(Math.round((cartItem.getSubTotal()+cartItem.getProduct().getShopPrice())*10)/10);
//                    System.out.println(cartItem.getSubTotal());

                    cartOne.setSubTotal(cartItem.getSubTotal());

                    //重新计算总计
                    cart.setTotal(Math.round((cart.getTotal()+cartItem.getProduct().getShopPrice())*10)/10);

                    cartOne.setTotal(cart.getTotal());
                    cartOne.setCount(cartItem.getCount());
//                    System.out.println(cart.getTotal());
                }
            }
            session.setAttribute("cart", cart);
            session.setMaxInactiveInterval(15*24*3600);

            Cookie cookie=new Cookie("JSESSIONID",session.getId());
            cookie.setMaxAge(15*24*3600);
            response.addCookie(cookie);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();

        }
        return cartOne;
    }

    @RequestMapping(value="/reduceProductFromCart",method = RequestMethod.POST)
    @ResponseBody
    public CartOne reduceProductFromCart(@RequestParam("pid") Long pid, HttpSession session, HttpServletResponse response){

        CartOne cartOne = new CartOne();
        try{
//            System.out.println(pid+" ");

            //取出购物车
            Cart cart = (Cart) session.getAttribute("cart");

            if(cart!=null){
                //取出map
                Map<Long, CartItem> map = cart.getItems();
                if(map.containsKey(pid)){
                    CartItem cartItem = map.get(pid);
//                if(cartItem.getCount()!=0){

                    cartItem.setCount(cartItem.getCount()-1);
                    //重新计算小记
                    cartItem.setSubTotal(Math.round((cartItem.getSubTotal()-cartItem.getProduct().getShopPrice())*10)/10);
//                    System.out.println(cartItem.getSubTotal());

                    cartOne.setSubTotal((cartItem.getSubTotal())*100/100);

                    //重新计算总计
                    cart.setTotal(Math.round((cart.getTotal()-cartItem.getProduct().getShopPrice())*10)/10);

                    cartOne.setTotal(cart.getTotal()*100/100);
                    cartOne.setCount(cartItem.getCount());
//                    System.out.println(cart.getTotal());
                    }

                }
//            }
            session.setAttribute("cart", cart);
            session.setMaxInactiveInterval(15*24*3600);

            Cookie cookie=new Cookie("JSESSIONID",session.getId());

            cookie.setMaxAge(15*24*3600);
            response.addCookie(cookie);

        }catch (Exception e){
            logger.error(e.getMessage(),e);
            e.printStackTrace();

        }
        return cartOne;
    }
}
