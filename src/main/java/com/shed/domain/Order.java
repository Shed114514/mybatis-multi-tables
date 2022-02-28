package com.shed.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private Integer oid;
    private Date ordertime;
    private Integer total;
    private Integer mid;

    // 在Java当中,需要封装实体Bean
    // 一个订单只能对应一个用户
    private Member member;

    public Order() {}

    public Order(Integer oid, Date ordertime, Integer total, Integer mid) {
        this.oid = oid;
        this.ordertime = ordertime;
        this.total = total;
        this.mid = mid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", ordertime=" + new SimpleDateFormat("yyyy-MM-dd").format(ordertime) +
                ", total=" + total +
                '}';
    }
}
