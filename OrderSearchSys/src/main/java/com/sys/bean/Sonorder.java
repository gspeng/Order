package com.sys.bean;

import java.util.Date;

/**
 *子订单类
 * 状态 ，玻璃 ，三责 ，车上人员 分别对应相应的数据表的主键
 */
public class Sonorder {
    private Integer sonorderid;       //子订单编号
    private double price;             //价格
    private String insurer;           //保险公司
    private Integer amount;           //次数
    private Date createtime;          //创建时间
    private Date effecttime;          //生效时间
    private String statusid;          //状态编号
    private String glassid;           //玻璃
    private Integer Dutyid;           //三责
    private Integer memberid;         //车上人员编号
    private String gongshengpeng;     //备注

    public Sonorder() {
    }

    public Sonorder(Integer sonorderid, double price, String insurer, Integer amount, Date createtime, Date effecttime, String statusid, String glassid, Integer dutyid, Integer memberid, String gongshengpeng) {
        this.sonorderid = sonorderid;
        this.price = price;
        this.insurer = insurer;
        this.amount = amount;
        this.createtime = createtime;
        this.effecttime = effecttime;
        this.statusid = statusid;
        this.glassid = glassid;
        Dutyid = dutyid;
        this.memberid = memberid;
        this.gongshengpeng = gongshengpeng;
    }

    public Integer getSonorderid() {
        return sonorderid;
    }

    public void setSonorderid(Integer sonorderid) {
        this.sonorderid = sonorderid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInsurer() {
        return insurer;
    }

    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEffecttime() {
        return effecttime;
    }

    public void setEffecttime(Date effecttime) {
        this.effecttime = effecttime;
    }

    public String getStatusid() {
        return statusid;
    }

    public void setStatusid(String statusid) {
        this.statusid = statusid;
    }

    public String getGlassid() {
        return glassid;
    }

    public void setGlassid(String glassid) {
        this.glassid = glassid;
    }

    public Integer getDutyid() {
        return Dutyid;
    }

    public void setDutyid(Integer dutyid) {
        Dutyid = dutyid;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getGongshengpeng() {
        return gongshengpeng;
    }

    public void setGongshengpeng(String gongshengpeng) {
        this.gongshengpeng = gongshengpeng;
    }

    @Override
    public String toString() {
        return "Sonorder{" +
                "sonorderid=" + sonorderid +
                ", price=" + price +
                ", insurer='" + insurer + '\'' +
                ", amount=" + amount +
                ", createtime=" + createtime +
                ", effecttime=" + effecttime +
                ", statusid='" + statusid + '\'' +
                ", glassid='" + glassid + '\'' +
                ", Dutyid=" + Dutyid +
                ", memberid=" + memberid +
                ", gongshengpeng='" + gongshengpeng + '\'' +
                '}';
    }
}
