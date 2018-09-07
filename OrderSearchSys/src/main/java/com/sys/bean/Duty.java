package com.sys.bean;

/**
 * 三责类
 */
public class Duty {
    private Integer dutyid;   //三责编号
    private String dutyprice; //三责价格

    public Duty() {
    }

    public Duty(Integer dutyid, String dutyprice) {
        this.dutyid = dutyid;
        this.dutyprice = dutyprice;
    }

    public Integer getDutyid() {
        return dutyid;
    }

    public void setDutyid(Integer dutyid) {
        this.dutyid = dutyid;
    }

    public String getDutyprice() {
        return dutyprice;
    }

    public void setDutyprice(String dutyprice) {
        this.dutyprice = dutyprice;
    }

    @Override
    public String toString() {
        return "Duty{" +
                "dutyid=" + dutyid +
                ", dutyprice='" + dutyprice + '\'' +
                '}';
    }
}
