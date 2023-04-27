package com.lhx.pojo;

public class emp {
    private Integer empid;
    private String empname;
    private Integer age;
    private String gender;
public emp(){}
    public emp(Integer empid, String empname, Integer age, String gender) {
        this.empid = empid;
        this.empname = empname;
        this.age = age;
        this.gender = gender;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
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

    @Override
    public String toString() {
        return "emp{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
