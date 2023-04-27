package com.lhx.spring.pojo;

import java.util.List;

public class banji {
    private String id;
    private String name;
    private List list;
public banji(){}
    public banji(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "banji{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
