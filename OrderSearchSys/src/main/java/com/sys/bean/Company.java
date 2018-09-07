package com.sys.bean;

/**
 * 公司类
 */
public class Company {
    private Integer companyid;   //公司编号
    private String companyname;  //

    public Company() {
    }

    public Company(Integer companyid, String companyname) {
        this.companyid = companyid;
        this.companyname = companyname;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyid=" + companyid +
                ", companyname='" + companyname + '\'' +
                '}';
    }
}
