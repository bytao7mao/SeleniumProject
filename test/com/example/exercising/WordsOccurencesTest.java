package com.example.exercising;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordsOccurencesTest {

    @Test
    void main() {
        int myList[] = {1, 2, 3};
        String text = "The giant panda has an insatiable appetite for bamboo. " +
                "A typical animal eats half the day—a full 12 out of every 24 " +
                "hours—and relieves itself dozens of times a day. It takes 28 " +
                "pounds of bamboo to satisfy a giant panda's daily dietary needs. " +
                "Pandas will sometimes eat birds or rodents as well.".toLowerCase();

        //split words by spaces
        String[] words = text.split(" |-");
        // Use a HashMap to store each word and its count
        Map<String, Integer> wordMap = new HashMap<>();
        // Count the occurrences of each word
        for (String s:words){
            if (wordMap.containsKey(s)){
                wordMap.put(s, wordMap.get(s) + 1);
            }else {
                wordMap.put(s, 1);
            }
        }
        // Display the duplicate words and their counts
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}