package com.example.exercising;

import java.util.*;

public class WordsOccurences {
    public WordsOccurences() {
    }

    public static void main(String[] args) {


        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        al.remove(0);


        LinkedList<String> al2=new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");
        al2.removeFirst();
        al2.removeLast();

//        System.out.println("arraylist: "+al);
//        System.out.println("arraylist size: "+al.size());
//        System.out.println("linkedlist: "+al2);
//        System.out.println("linkedlist size: "+al2.size());


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
            } else {
                wordMap.put(s, 1);
            }
        }
        System.out.println(wordMap.entrySet());
        // Display the duplicate words and their counts
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            if (entry.getValue() > 1) {
//                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

}
