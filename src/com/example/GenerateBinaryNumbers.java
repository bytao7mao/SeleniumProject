package com.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    // Return an array with the first n binary numbers.
    static void charToByte(char[] chars) {
        byte[] bytes = new byte[chars.length];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) chars[i];
        }
        System.out.println(Arrays.toString(bytes));
    }
    static void strToByte(String str) {
        char[] chars = str.toCharArray();
        byte[] bytes = new byte[chars.length];
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) chars[i];
        }
        System.out.println(Arrays.toString(bytes));
    }

    public static void main(String[] args) {
        int num = 6;
        char[] chars = {'A', 'B'};
        charToByte(chars);
        String charsStr = "AB";
        strToByte(charsStr);


    }
}
