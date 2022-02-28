package com.shed.domain;

import java.util.List;

public class User {
    private Integer uid;
    private String name;
    private Integer age;
    private String password;

    // 当前用户所具备的角色
    private List<Role> roleList;

    public User() {}

    public User(Integer uid, String name, Integer age, String password) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", roleList=" + roleList +
                '}';
    }
}
