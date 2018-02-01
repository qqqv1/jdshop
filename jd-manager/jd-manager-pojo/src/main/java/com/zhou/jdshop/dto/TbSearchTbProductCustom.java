package com.zhou.jdshop.dto;

<<<<<<< HEAD
public class TbSearchTbProductCustom {
    private String id;
    private String pname;//
    private String pdesc;//
    private Long price;//
    private String pimage;//
    private String cname;//
    private Integer psold;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

=======
import com.zhou.jdshop.pojo.po.TbProduct;
>>>>>>> 8bdc5e9255f8d133d862e72234035e2e896168e3

public class TbSearchTbProductCustom extends TbProduct{
    private String cname;
    private String id;
    private String price;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
<<<<<<< HEAD

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getPsold() {
        return psold;
    }

    public void setPsold(Integer psold) {
        this.psold = psold;
    }
=======
>>>>>>> 8bdc5e9255f8d133d862e72234035e2e896168e3
}
