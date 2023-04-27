package com.student.pojo;

public class student {
    private Integer id;
    private String name;
    private Integer age;
    private String happy;

    public student(){}
    public student(Integer id, String name, Integer age, String happy) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHappy() {
        return happy;
    }

    public void setHappy(String happy) {
        this.happy = happy;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", happy='" + happy + '\'' +
                '}';
    }
}
