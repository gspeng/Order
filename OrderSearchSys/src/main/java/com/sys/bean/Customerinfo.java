package com.sys.bean;

import java.util.Date;

/**
 * 客户类
 */
public class Customerinfo {
    private Integer customerid;  //客户编号
    private String platenumber;  //车牌号
    private String customername; //投保人
    private String idcard;       //身份证号
    private String brand;        //品牌型号
    private String carframe;     //车架号
    private String motor;        //发动机号
    private Date Regdate;        //注册日期
    private Date signtime;       //签单日期
    private Date expiretime;     //保险到期日
    private String customertype; //用户类型

    public Customerinfo() {
    }

    public Customerinfo(Integer customerid, String platenumber, String customername, String idcard, String brand, String carframe, String motor, Date regdate, Date signtime, Date expiretime, String customertype) {
        this.customerid = customerid;
        this.platenumber = platenumber;
        this.customername = customername;
        this.idcard = idcard;
        this.brand = brand;
        this.carframe = carframe;
        this.motor = motor;
        Regdate = regdate;
        this.signtime = signtime;
        this.expiretime = expiretime;
        this.customertype = customertype;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getPlatenumber() {
        return platenumber;
    }

    public void setPlatenumber(String platenumber) {
        this.platenumber = platenumber;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarframe() {
        return carframe;
    }

    public void setCarframe(String carframe) {
        this.carframe = carframe;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Date getRegdate() {
        return Regdate;
    }

    public void setRegdate(Date regdate) {
        Regdate = regdate;
    }

    public Date getSigntime() {
        return signtime;
    }

    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    public Date getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    @Override
    public String toString() {
        return "Customerinfo{" +
                "customerid=" + customerid +
                ", platenumber='" + platenumber + '\'' +
                ", customername='" + customername + '\'' +
                ", idcard='" + idcard + '\'' +
                ", brand='" + brand + '\'' +
                ", carframe='" + carframe + '\'' +
                ", motor='" + motor + '\'' +
                ", Regdate=" + Regdate +
                ", signtime=" + signtime +
                ", expiretime=" + expiretime +
                ", customertype='" + customertype + '\'' +
                '}';
    }
}
