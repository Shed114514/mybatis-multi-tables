package com.shed.domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Member {
    private Integer mid;
    private String name;
    private Integer age;
    private Date birthday;

    // 在Java当中,需要封装实体Bean
    // 一个用户可拥有多个订单,因此用集合来把每个订单对象进行封装
    private List<Order> orderList;

    public Member() {}

    public Member(Integer mid, String name, Integer age, Date birthday) {
        this.mid = mid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mid=" + mid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + new SimpleDateFormat("yyyy-MM-dd").format(birthday) +
                ", orderList=" + orderList +
                '}';
    }
}
