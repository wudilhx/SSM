package com.lhx.spring.pojo;

import java.util.Arrays;

public class student {
    private Integer id;
    private String name;
    private String happy;
    private banji ban;
    private String [] aa;
    public student(){}

    public student(Integer id, String name, String happy) {
        this.id = id;
        this.name = name;
        this.happy = happy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHappy() {
        return happy;
    }

    public void setHappy(String happy) {
        this.happy = happy;
    }

    public banji getBan() {
        return ban;
    }

    public void setBan(banji ban) {
        this.ban = ban;
    }

    public String[] getAa() {
        return aa;
    }

    public void setAa(String[] aa) {
        this.aa = aa;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", happy='" + happy + '\'' +
                ", ban=" + ban +
                ", aa=" + Arrays.toString(aa) +
                '}';
    }

}
