package com.example.exercising;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestingMaps {

    public static void main(String[] args) {
        String text = "The giant panda has an insatiable appetite for bamboo. " +
                "A typical animal eats half the day—a full 12 out of every 24 " +
                "hours—and relieves itself dozens of times a day. It takes 28 " +
                "pounds of bamboo to satisfy a giant panda's daily dietary needs. " +
                "Pandas will sometimes eat birds or rodents as well.".toLowerCase();

        //split words by spaces
        String[] words = text.split(" |-");
        System.out.println(Arrays.toString(Arrays.stream(words).toArray()));

        Map<String, Integer> eachWordMapping = new HashMap<>();
        for (String s:words){
            if (eachWordMapping.containsKey(s)){
                eachWordMapping.put(s, eachWordMapping.get(s) + 1);
            } else {
                eachWordMapping.put(s, 1);
            }
        }
        //to read from HashMap
        for (Map.Entry<String, Integer> entry: eachWordMapping.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}
