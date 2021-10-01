package com.company;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What hour of the day is it?");
        int time = input.nextInt();
        if (time >= 0 && time < 6) {
            System.out.println("Sleep!");
        } else {
            if (time >= 6 && time < 12) {
                System.out.println("Good Morning Sunshine!");
            } else {
                if (time >= 12 && time < 19) {
                    System.out.println("Good Afternoon. Work hard!");
                } else {
                    if (time >=19 && time <= 24) {
                        System.out.println("Good Evening. Get some rest!");
                    } else {
                        System.out.println("There are only 24 hours a day!");
                    }
                }
            }
        }

    }
    }

