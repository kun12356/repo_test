package com.jishou;

public class Person {
    //修改
    private String name;
    private String addressp;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressp() {
        return addressp;
    }

    public void setAddressp(String addressp) {
        this.addressp = addressp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addressp='" + addressp + '\'' +
                ", id=" + id +
                '}';
    }
}
