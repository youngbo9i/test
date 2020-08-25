package com.gem.entity;

public class Orderdetail {
    private Integer orderdetailId;

    private String orderid;

    private Integer goodsid;

    private Integer buygoodsnum;

    private Double allprice;

    public Integer getOrderdetailId() {
        return orderdetailId;
    }

    public void setOrderdetailId(Integer orderdetailId) {
        this.orderdetailId = orderdetailId;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getBuygoodsnum() {
        return buygoodsnum;
    }

    public void setBuygoodsnum(Integer buygoodsnum) {
        this.buygoodsnum = buygoodsnum;
    }

    public Double getAllprice() {
        return allprice;
    }

    public void setAllprice(Double allprice) {
        this.allprice = allprice;
    }
}