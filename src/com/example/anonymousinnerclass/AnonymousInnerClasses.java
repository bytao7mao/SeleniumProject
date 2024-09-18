package com.example.anonymousinnerclass;

import org.checkerframework.checker.units.qual.A;

public class AnonymousInnerClasses {

    public static void main(String[] args) {
        Animal myAnimal = new Pig();

        String name = myAnimal.getName();
        System.out.println(name);

        Animal bigFoot = new Pig() {
            public String getName() {
                return name + " but i am bigFOot";
            }
        };
        System.out.println(bigFoot.getName());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };

        boolean c = compareClass(myAnimal, bigFoot);
        System.out.println(c);
        String k = myAnimal.getName();
        String k2 = String.valueOf(myAnimal.getClass());
        System.out.println(myAnimal.getClass());
        System.out.println(myAnimal.getClass().getName());


    }
    public static boolean compareClass(Object o1, Object o2){
        if (o1.getClass() == o2.getClass()){
            return true;
        }else {
            return false;
        }
    }
}
