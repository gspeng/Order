package com.sys.bean;

/**
 * 玻璃为选择项类
 */
public class Glass {
    private Integer glassid;  //玻璃编号
    private String glasstype;  //类型

    public Glass() {
    }

    public Glass(Integer glassid, String glasstype) {
        this.glassid = glassid;
        this.glasstype = glasstype;
    }

    public Integer getGlassid() {
        return glassid;
    }

    public void setGlassid(Integer glassid) {
        this.glassid = glassid;
    }

    public String getGlasstype() {
        return glasstype;
    }

    public void setGlasstype(String glasstype) {
        this.glasstype = glasstype;
    }

    @Override
    public String toString() {
        return "Glass{" +
                "glassid=" + glassid +
                ", glasstype='" + glasstype + '\'' +
                '}';
    }
}
