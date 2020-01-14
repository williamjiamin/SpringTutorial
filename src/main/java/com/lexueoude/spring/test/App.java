package com.lexueoude.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

        Jungle jungle = (Jungle)context.getBean("jungle");
        System.out.println(jungle);
//        Person person = (Person)context.getBean("person");
//        person.setIncomeNum(1888);
//        System.out.println(person);
//
//        Address address2 = (Address)context.getBean("address2");
//        System.out.println(address2);


//        FruitBasket basket = (FruitBasket)context.getBean("basket");
//        System.out.println(basket);


        ((FileSystemXmlApplicationContext)context).close();
    }
}
