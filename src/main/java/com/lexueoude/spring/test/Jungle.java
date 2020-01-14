package com.lexueoude.spring.test;

import java.util.List;

public class Jungle {
    private Animal largest;
    private List<Animal> animals;

    public Animal getLargest() {
        return largest;
    }

    public void setLargest(Animal largest) {
        this.largest = largest;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("丛林之中个头最大的动物为" +largest);
        sb.append("\n");
        sb.append("所有的动物有：\n");

        for(Animal animal:animals){
            sb.append(animal);
            sb.append("\n");
        }

        return sb.toString();
    }
}
