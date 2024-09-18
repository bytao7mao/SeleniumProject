package com.example;

public class AlgoCalculateTwoNumbers {

    //O n2 time complexity
    static int maxProductOfTwoNumbers(int[] numbers){
        int productOfTwoNums = Integer.MIN_VALUE;
        int indexOfNumbers = numbers.length;
        System.out.println("length " + indexOfNumbers);

        //if there is no number in the array
        if (indexOfNumbers == 0){
            return productOfTwoNums;
            //if there is one number in the array
        } else if (indexOfNumbers == 1){
            return numbers[0];
        } else {
            for (int i=0; i < numbers.length; i++){
                for (int j = i +1; j < numbers.length; j++){
                    if (productOfTwoNums < (numbers[i]*numbers[j])){
                        productOfTwoNums = (numbers[i]*numbers[j]);
                    }
                }
            }
            return productOfTwoNums;
        }
    }

    public static void main(String[] args) {

        int[] numbers = {7, 17, 13, 19, 5};
        int max = maxProductOfTwoNumbers(numbers);
        System.out.println(max);

        // Declare an array
        int[] nums;

        // Declare and allocate an array
        double[] otherNums = new double[5];

        // Declare, allocate, and init an array
        String[] availablePetsArray = {"cat", "dog", "fish"};
        String[] unavailablePetsArray = {"bird", "rabbit", "hamster", "gerbil"};

//        System.out.println(Arrays.toString(availablePetsArray));
//        System.out.println(Arrays.toString(unavailablePetsArray));

        int indexofAvailablePet = 2;//fish index
        int indexOfUnavailablePet = 0;//bird index

        String availablePet = availablePetsArray[indexofAvailablePet];
        String unavailablePet = unavailablePetsArray[indexOfUnavailablePet];

        //switch fish with bird
        availablePetsArray[indexofAvailablePet] = unavailablePet;
        unavailablePetsArray[indexOfUnavailablePet] = availablePet;

//        System.out.println(Arrays.toString(availablePetsArray));
//        System.out.println(Arrays.toString(unavailablePetsArray));
    }
}
