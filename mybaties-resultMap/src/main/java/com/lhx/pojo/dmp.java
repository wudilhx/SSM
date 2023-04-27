package com.lhx.pojo;

import java.util.List;

public class dmp {
    private Integer depid;
    private String depname;
    private List<emp> emps;
public dmp(){}
    public dmp(Integer depid, String depname) {
        this.depid = depid;
        this.depname = depname;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public List<emp> getEmps() {
        return emps;
    }

    public void setEmps(List<emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "dmp{" +
                "depid=" + depid +
                ", depname='" + depname + '\'' +
                ", emps=" + emps +
                '}';
    }
}