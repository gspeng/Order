package com.sys.bean;

/**
 * 状态表
 */
public class Status {
    private Integer stausid;   //状态编号
    private String statusname; //状态

    public Status() {
    }

    public Status(Integer stausid, String statusname) {
        this.stausid = stausid;
        this.statusname = statusname;
    }

    public Integer getStausid() {
        return stausid;
    }

    public void setStausid(Integer stausid) {
        this.stausid = stausid;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    @Override
    public String toString() {
        return "Status{" +
                "stausid=" + stausid +
                ", statusname='" + statusname + '\'' +
                '}';
    }
}
