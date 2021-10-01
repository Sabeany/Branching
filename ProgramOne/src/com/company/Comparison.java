package com.company;

public class Comparison {

    public static void main(String[] args) {
	    short numberOne = 98;
	    short numberTwo = 9;
        if (numberOne > numberTwo){
                System.out.println("Number One is greater than Number Two");
        } else if (numberOne == numberTwo){
                System.out.println("Both numbers are equal");
            }
        else {
            System.out.println("Number Two is greater than Number One");
        }
        //even/odd
        if (numberOne % 2 == 0) {
            System.out.println("Number One is even");
        }else{
            System.out.println("Number Two is odd");
        }
        if (numberTwo % 2 == 0){
            System.out.println("Number Two is even");
        }else{
            System.out.println("Number Two is odd");
        }

        //equal
        if(numberOne==numberTwo){
            System.out.println("Both numbers are equal");
        } else {
            System.out.println("Numbers are not equal");
        }

        //negative/positive
        if (numberOne < 0){
            System.out.println("Number One is negative");
        } else {
            System.out.println("Number One is positive");
        }
        if (numberTwo < 0){
            System.out.println("Number Two is negative");
        }else{
            System.out.println("Number Two is positive");
        }

        //Less than 100
        if(numberOne < 100){
            System.out.println("Number One is less than 100");
        }else{
            System.out.println("Number One is more than 100");
        }
        if(numberTwo < 100){
            System.out.println("Number Two is less than 100");
        }else{
            System.out.println("Number Two is more than 100");
        }
    }



}
