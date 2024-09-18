package com.example;

import java.sql.Statement;
import java.util.*;

public class StringFunctions {

    static int countVowels(String string){
        int countVowels = 0;
        String normalizeString = string.toLowerCase().trim();

        for (int i=0; i < normalizeString.length(); i++){
            if (normalizeString.charAt(i) == 'a' || normalizeString.charAt(i) == 'e' ||
                    normalizeString.charAt(i) == 'i' || normalizeString.charAt(i) == 'o' ||
                    normalizeString.charAt(i) == 'u' || normalizeString.charAt(i) == 'y'){
                countVowels++;
            }
        }

        return countVowels;
    }
    static boolean hasMatchingParantheses(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> blockSymbols = Map.of(
                ')','(',
                ']', '[',
                '>','<'
        );
        for (int i =0; i < s.length(); i++){
            char current = s.charAt(i);
            if (blockSymbols.containsValue(current)){
                stack.push(current);
                continue;
            }
            if (blockSymbols.containsKey(current)&&
                    (stack.isEmpty() || blockSymbols.get(current) != stack.pop())){
                return false;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {

//        String a = "txtx ss ss";
////        System.out.println(a.concat("dd"));
//        int result = countVowels(a);
//        System.out.println(result);
//        System.out.println(a==anothera);
        String text = "The giant panda has an insatiable appetite for bamboo. " +
                "A typical animal eats half the day—a full 12 out of every 24 " +
                "hours—and relieves itself dozens of times a day. It takes 28 " +
                "pounds of bamboo to satisfy a giant panda's daily dietary needs. " +
                "Pandas will sometimes eat birds or rodents as well.".toLowerCase();
//        System.out.println("split " + a.split(" ").length);
//        String[] sentences = text.split("\\.");
//        System.out.println("The text has " + sentences.length + " sententces.");
        String[] words = text.split(" |-");
//        System.out.println("The text has " + words.length + " words.");
//        System.out.println(Arrays.asList(words));
//        System.out.println("The text has " + text.length() + " chars.");

        // Use a HashMap to store each word and its count
        Map<String, Integer> wordCountMap = new HashMap<>();
        // Count the occurrences of each word
        for (String word:words){
            if (wordCountMap.containsKey(word)){
                wordCountMap.put(word, wordCountMap.get(word) +1);
            }else{
                wordCountMap.put(word, 1);
            }
        }
        // Display the duplicate words and their counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }





    }
}
