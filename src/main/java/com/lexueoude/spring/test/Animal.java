package com.lexueoude.spring.test;

public class Animal {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "这个Animal的信息如下{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
