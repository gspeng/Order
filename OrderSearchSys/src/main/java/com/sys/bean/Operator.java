package com.sys.bean;

import java.util.Date;

/**
 * 操作员类
 */
public class Operator {
    private Integer operatorid;       //操作员编号
    private String operatorpwd;       //操作员密码
    private String organizeid;        //所属机构号
    private Integer operatorlevel;    //等级
    private String operatorname;      //名称
    private String operatorphone;     //电话
    private Date Lastlogin;           //最后一次登录时间

    public Operator() {
    }

    public Operator(Integer operatorid, String operatorpwd, String organizeid, Integer operatorlevel, String operatorname, String operatorphone, Date lastlogin) {
        this.operatorid = operatorid;
        this.operatorpwd = operatorpwd;
        this.organizeid = organizeid;
        this.operatorlevel = operatorlevel;
        this.operatorname = operatorname;
        this.operatorphone = operatorphone;
        Lastlogin = lastlogin;
    }

    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    public String getOperatorpwd() {
        return operatorpwd;
    }

    public void setOperatorpwd(String operatorpwd) {
        this.operatorpwd = operatorpwd;
    }

    public String getOrganizeid() {
        return organizeid;
    }

    public void setOrganizeid(String organizeid) {
        this.organizeid = organizeid;
    }

    public Integer getOperatorlevel() {
        return operatorlevel;
    }

    public void setOperatorlevel(Integer operatorlevel) {
        this.operatorlevel = operatorlevel;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname;
    }

    public String getOperatorphone() {
        return operatorphone;
    }

    public void setOperatorphone(String operatorphone) {
        this.operatorphone = operatorphone;
    }

    public Date getLastlogin() {
        return Lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        Lastlogin = lastlogin;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "operatorid=" + operatorid +
                ", operatorpwd='" + operatorpwd + '\'' +
                ", organizeid='" + organizeid + '\'' +
                ", operatorlevel=" + operatorlevel +
                ", operatorname='" + operatorname + '\'' +
                ", operatorphone='" + operatorphone + '\'' +
                ", Lastlogin=" + Lastlogin +
                '}';
    }
}
