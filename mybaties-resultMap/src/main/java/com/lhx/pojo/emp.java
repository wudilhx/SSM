package com.lhx.pojo;

public class emp {
    private String empid;
    private String empname;
    private Integer age;
    private String gender;
    private dmp dmp;
public  emp(){}
    public emp(String empid, String empname, Integer age, String gender) {
        this.empid = empid;
        this.empname = empname;
        this.age = age;
        this.gender = gender;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public com.lhx.pojo.dmp getDmp() {
        return dmp;
    }

    public void setDmp(com.lhx.pojo.dmp dmp) {
        this.dmp = dmp;
    }

    @Override
    public String toString() {
        return "emp{" +
                "empid='" + empid + '\'' +
                ", empname='" + empname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dmp=" + dmp +
                '}';
    }
}
