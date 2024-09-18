package com.example;

public class SortingAlgo {
    static void swap(int[] x) {
        x[0]++;
        System.out.println("in method " + x[0]);
    }
    static void increment(int x){
        x++;
        System.out.println("in method " + x);
    }

    public static void main(String[] args) {

        int x = 1;
        increment(x);
        System.out.println(x);

        int[] x2 = {1};
        swap(x2);
        System.out.println(x2[0]);

        double[] prices = {1, 10, 22};
//        double x = findHighestValueFromArray(prices);
//        System.out.println(x);

        String reverseThis = "aabbbb";
//        System.out.println(reverseTheStringFromCharArray(reverseThis));

        char[] chars = {'a', 'b', 'c'};
        char[] xChars = reverseChars(chars);
//        System.out.println(xChars);

        int[] values = {0, 11, 1};
        sortingFromHighest(values);
        for (int i: values){
//            System.out.println(i + " ");
        }



    }

    static double findHighestValueFromArray(double[] prices) {
        double highestValue = prices[0];
        // Your code goes here.
        for (int i=0; i<prices.length; i++){
            if (highestValue<prices[i]){
                highestValue=prices[i];
            }
        }
        return highestValue;
    }

    static int[] sortingFromHighest(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                //compare and swap
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    static String reverseTheStringFromCharArray(String string){
        char[] stringAsByteArr = string.toCharArray(); //the initial string transformed into array of characters
        char[] result = new char[stringAsByteArr.length]; //the new array of characters in reverse order
        for (int i=0;i<stringAsByteArr.length;i++){
            //for each char in reverse order, put in the new char array
            result[i] = stringAsByteArr[stringAsByteArr.length-i-1];
        }
        return String.valueOf(result);
    }
    static char[] reverseChars(char[] inputChar){
        char[] returnThis = new char[inputChar.length];
        for (int i=0;i<inputChar.length;i++){
            returnThis[i] = inputChar[inputChar.length-i-1];
        }
        return returnThis;
    }
}
