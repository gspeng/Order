package com.sys.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 主订单类
 */
public class Order {
    private String orderid;      //主订单编号
    private Integer customerid;  //客户编号
    private String orderstatus;  //订单状态
    private String organizeid;   //所属机构
    private List<Sonorder>sonorders=new ArrayList<>(); //存放的子订单的集合
    private Date createtime;     //创建时间

    public Order() {
    }

    public Order(String orderid, Integer customerid, String orderstatus, String organizeid, List<Sonorder> sonorders, Date createtime) {
        this.orderid = orderid;
        this.customerid = customerid;
        this.orderstatus = orderstatus;
        this.organizeid = organizeid;
        this.sonorders = sonorders;
        this.createtime = createtime;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getOrganizeid() {
        return organizeid;
    }

    public void setOrganizeid(String organizeid) {
        this.organizeid = organizeid;
    }

    public List<Sonorder> getSonorders() {
        return sonorders;
    }

    public void setSonorders(List<Sonorder> sonorders) {
        this.sonorders = sonorders;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid='" + orderid + '\'' +
                ", customerid=" + customerid +
                ", orderstatus='" + orderstatus + '\'' +
                ", organizeid='" + organizeid + '\'' +
                ", sonorders=" + sonorders +
                ", createtime=" + createtime +
                '}';
    }
}
