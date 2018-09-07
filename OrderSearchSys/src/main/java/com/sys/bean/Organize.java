package com.sys.bean;

/**
 * 管理机构类
 */
public class Organize {
    private Integer organizeid;   //机构编号
    private String organizename;  //机构名称
    private Integer organizelevel;//机构等级

    public Organize() {
    }

    public Organize(Integer organizeid, String organizename, Integer organizelevel) {
        this.organizeid = organizeid;
        this.organizename = organizename;
        this.organizelevel = organizelevel;
    }

    public Integer getOrganizeid() {
        return organizeid;
    }

    public void setOrganizeid(Integer organizeid) {
        this.organizeid = organizeid;
    }

    public String getOrganizename() {
        return organizename;
    }

    public void setOrganizename(String organizename) {
        this.organizename = organizename;
    }

    public Integer getOrganizelevel() {
        return organizelevel;
    }

    public void setOrganizelevel(Integer organizelevel) {
        this.organizelevel = organizelevel;
    }

    @Override
    public String toString() {
        return "Organize{" +
                "organizeid=" + organizeid +
                ", organizename='" + organizename + '\'' +
                ", organizelevel=" + organizelevel +
                '}';
    }
}
