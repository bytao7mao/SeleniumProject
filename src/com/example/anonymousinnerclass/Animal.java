package com.example.anonymousinnerclass;

public abstract class Animal {
    private String name;

    public abstract void makeNoise();

    public String getName() {
        return name;
    }

    //override
    public void setName(String name) {
        this.name = name;
    }
    //overload
    public void setName(String name, String name2){
        this.name = name+name2;
    }
}
