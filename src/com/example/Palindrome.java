package com.example;

public class Palindrome {

    public static void main(String[] args) {
//        System.out.println("aa,,A".toLowerCase().trim().replace(",",""));

//        String palindrome = "abba";
//        System.out.println((palindrome));


        String str = "Radar", reverseStr = "";
        boolean newBool = isPalindrome(str);
        System.out.println(newBool);
//        for (int i = str.length() - 1; i >=0; i--) {
//            reverseStr = reverseStr + str.charAt(i);
//        }
//
//        if (reverseStr.equalsIgnoreCase(str)) {
//            System.out.println(str + " is a Palindrome String.");
//        }
//        else {
//            System.out.println(str + " is not a Palindrome String.");
//        }
    }

    static boolean checkPalindrome(String inputString) {
        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }

    static boolean isPalindrome(String original){
        String normalized = original.toLowerCase().trim();
        int start = 0;
        int end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }





}
