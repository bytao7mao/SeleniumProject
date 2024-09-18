package com.example.lambda;

import org.checkerframework.checker.units.qual.C;

public class TestLambda {

    public static void main(String[] args) {

        Printable printable = (str, str2) -> {
            return str + str2;
        };

        functionalInterface functionalInterface =
                (x, y) -> x + y;
        int result = functionalInterface.sum(7, 6);
        System.out.println("result: " + result);


        StringInterface stringInterface = (str) -> {
            String resultString = "";
            char[] chars = str.toCharArray();
            for (int i = str.length()-1; i >= 0; i--){
                resultString = resultString + (chars[i]);
            }
            return resultString;
        };
        System.out.println(stringInterface.reverse("marius"));
    }
}
