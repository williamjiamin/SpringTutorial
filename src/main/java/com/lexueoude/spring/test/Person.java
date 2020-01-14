package com.lexueoude.spring.test;

public class Person {

    private int id;
    private String name;
    private int incomeNum;
    private Address address;

    public Person(){

    }


    public static Person getInstance(int id,String name){
        System.out.println("正在通过Factory Method 生成这个Person");
        return new Person(id,name);
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void onCreate(){
        System.out.println("创建了一个person：" + this);
    }


    public void onDestroy(){
        System.out.println("这个person被销毁了:" +this);
    }


    public void setIncomeNum(int incomeNum) {
        this.incomeNum = incomeNum;
    }

    public void speak() {
        System.out.println("Hello everyone , I am William saying hello from our project");
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", incomeNum=" + incomeNum +
                ", address=" + address +
                '}';
    }


    public void setAddress(Address address) {
        this.address = address;
    }
}
