package com.shed.domain;

public class Role {
    private Integer rid;
    private String roleName;
    private String introduction;

    public Role() {}

    public Role(Integer rid, String roleName, String introduction) {
        this.rid = rid;
        this.roleName = roleName;
        this.introduction = introduction;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", roleName='" + roleName + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
