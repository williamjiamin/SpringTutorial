package com.lexueoude.spring.test;

import java.util.List;

public class FruitBasket {
    private String name;
    private List<String> fruits;

    public FruitBasket(String name, List<String> fruits) {
        this.name = name;
        this.fruits = fruits;
    }


    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("水果篮子里面包含：\n");

        for(String fruit:fruits){
            sb.append(fruit);
            sb.append("\n");
        }

        return sb.toString();
    }
}
