package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        arraytotal();
        numberinputsum();
        numberinputaverage();
        namesmethod();
        backwardsarray();
        hellot();
        matchingpairs();
        indexprint();
    }

    // Create an array to hold the numbers 1-10. Sum the numbers and print.
    public static void arraytotal(){
        int[] q1array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i : q1array){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    // Create an array to hold 10 number inputs from the user and print that total to the screen.
    public static void numberinputsum(){
        //create a new scanner
        Scanner scnr = new Scanner(System.in);
        // ask for input for array length
        System.out.println("Enter length of the array");
        int length = scnr.nextInt();
        //get number inputs no longer than the length of the array
        int[] input = new int[length];
        // 1st create a new method(variable) and set to sum = 0 then do for loop and add sum to for loop total
        System.out.println("Enter number");
        int sum = 0;
        for(int i = 0; i < length; i++){
            input[i] = scnr.nextInt();
            sum += input[i];
        }

        System.out.println("Sum is " + sum);
    }

    // Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
    public static void numberinputaverage(){
        Scanner scnr = new Scanner(System.in);
        // ask for input for array length
        System.out.println("Enter length of the array");
        int length = scnr.nextInt();
        //get number inputs no longer than the length of the array
        int[] input = new int[length];
        // 1st create a new method(variable) and set to sum = 0 then do for loop and add sum to for loop total
        System.out.println("Enter number");
        int sum = 0;
        float average;
        for(int i = 0; i < length; i++){
            input[i] = scnr.nextInt();
            sum += input[i];
        }

        System.out.println("Sum is " + sum);
        average = (float) sum / length;
        System.out.println("Average is " + average);
    }

    //Create an array to store 3 names, loop through that array to print out the names.
    public static void namesmethod() {
        String[] namearray = new String[]{"john", "jacob", "jingle"};

        for (int i = 0; i < namearray.length; i++) {
            System.out.println(namearray[i]);
        }
    }

    // Declare an array with the numbers 1-10. Print that total to the screen backwards.
    public static void backwardsarray(){
        int[] myarray = new int[10];
        myarray[0] = 1;
        myarray[1] = 2;
        myarray[2] = 3;
        myarray[3] = 4;
        myarray[4] = 5;
        myarray[5] = 6;
        myarray[6] = 7;
        myarray[7] = 8;
        myarray[8] = 9;
        myarray[9] = 10;
        for (int i = myarray.length - 1; i >=0; --i){
            System.out.println(myarray[i]);
        }
    }
    // Given an array with these letters, loop through the array and replace the letter "t" with "hello".
    public static void hellot(){
        String[] letters = new String[5];
        letters[0] = "w";
        letters[1] = "t";
        letters[2] = "y";
        letters[3] = "h";
        letters[4] = "k";
        for (int i = 0; i < 5; i++) {
            if (letters[1] == "t");{
                letters[1] = "hello";
            }
            System.out.println(letters[i]);
        }
    }
    //Create an array with the following values. Loop through the array and print the index when the value equals 5.
    public static void indexprint(){
        int[] indexarray = new int[]{2,5,9,0,2,1,8,5,4};
        for (int i=0; i < indexarray.length; i++ ){
            if (indexarray[i] == 5){
                System.out.print(i);
            }else{
                System.out.println(" ");
            }
        }
    }
    //Given two arrays with the following numbers print out the matching pairs.
    public static void matchingpairs(){
        int[] array1 = new int[]{1,7,6,5,9};
        int[] array2 = new int[]{2,7,6,3,4};
        int count = 0;
        for(int i=0; i<array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i]);
                    System.out.print(array2[j]);
                }

            }
        }
    }

}