package com.example.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Room cambridge =
                new Room("Cambridge", "Premiere Room",
                        4, 175.00);
        Room manchester =
                new Room("Manchester", "Suite",
                        5, 250.00);
        Room piccadilly =
                new Room("Piccadilly", "Guest Room",
                        3, 125.00);
        Room oxford =
                new Room("Oxford", "Suite",
                        5, 225.00);

        Collection<Room> rooms = new ArrayList<>(List.of(cambridge, manchester));
        rooms.add(piccadilly);
        rooms.add(oxford);

        double total = getPotentialrevenue(rooms);
        System.out.println(total);




    }

    private static double getPotentialrevenue(Collection<Room> rooms){
        return rooms.stream()
                .mapToDouble(r -> r.getPrice())
                .sum();

    }
}
