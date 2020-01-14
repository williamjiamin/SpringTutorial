package com.lexueoude.spring.test;

public class PersonFactory {
    public Person createPerson(int id, String name){
        System.out.println("正在通过外面的工厂创建这样一个人");
        return new Person(id,name);
    }
}
