package cn.com.webxml;

/**
 * User: DHC
 * Date: 2018/1/30
 * Time: 14:16
 * Version:V1.0
 */
public class MobileClient {
    public static void main(String[] args) {
        /// 1.创建服务视图
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        // 2.获取服务实现类
        MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getPort(MobileCodeWSSoap.class);
        // 3.调用查询方法
        String result = mobileCodeWSSoap.getMobileCodeInfo("15167919492", "");
        System.out.println(result);
    }
}
