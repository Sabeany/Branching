package com.company;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many hours a day do you work?");
        int workingHoursInDay = input.nextInt();
        if(workingHoursInDay < 0){
            System.out.println("You cannot work negative hours!");
        }
        else if (workingHoursInDay >= 0 && workingHoursInDay <=8){
            System.out.println("Your daily salary is " + workingHoursInDay * 10 + " EUR");
        }else{
            System.out.println("Your daily salary is " + (80 + (workingHoursInDay -8 )* 15) + " EUR");
        }
    }
}
