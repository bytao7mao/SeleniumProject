package com.example;

import java.util.LinkedList;

public class LinkedListClass {

    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        // Add students to the Linked List
        students.add("Charlie");
        students.add("Sally");
        students.add("Morgan");
        students.add("Taylor");
        students.add("Jamie");

        students.addFirst("Sarah");
        students.addLast("Hailey");
        students.add(2, "Tara");

        for (String s:students){
            System.out.print(s + " - ");
        }

        // Retrieve items from a Linked List by placement
        String firstStudent = students.getFirst();
        System.out.println("First Student: " + firstStudent);

        String lastStudent = students.getLast();
        System.out.println("Last Student: " + lastStudent);

        // Retrieve items from a Linked List by index
        String secondStudent = students.get(1);
        System.out.println("Second Student: " + secondStudent);

        // Retrieve index of specific item
        int i = students.indexOf("Morgan");
        System.out.println("Index of Morgan: " + i);

        // Access size of a Linked List
        System.out.println("Size: " + students.size());

        // Remove items by placement, object, and index
        students.removeFirst();
        students.removeLast();
        students.remove("Jamie");
        students.remove(1);
        System.out.println(students);

        // Search for items in a Linked List
        boolean hasTaylor = students.contains("Taylor");
        System.out.println("Have taylor? " + hasTaylor);

        // Empty the list
        students.clear();
        System.out.println(students);
    }
}
