package com.example.anonymousinnerclass;

public class Pig extends Animal implements AnimalStuff{
    private String name;

    @Override
    public void makeNoise() {
        System.out.println("DHSAIONDIOSANIOD");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void poop() {

    }
}
