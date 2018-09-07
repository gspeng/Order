package com.sys.bean;

/**
 * 成员类
 */
public class Member {
    private Integer memberid;    //成员编号
    private String memberprice;  //成员价格

    public Member() {
    }

    public Member(Integer memberid, String memberprice) {
        this.memberid = memberid;
        this.memberprice = memberprice;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getMemberprice() {
        return memberprice;
    }

    public void setMemberprice(String memberprice) {
        this.memberprice = memberprice;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberid=" + memberid +
                ", memberprice='" + memberprice + '\'' +
                '}';
    }
}
