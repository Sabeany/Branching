package com.company;

import java.util.Scanner;

public class DMY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a date");
        int date = input.nextInt();
        System.out.println("Write a month");
        int month = input.nextInt();
        System.out.println("Write a year");
        int year = input.nextInt();
          System.out.println("Please select the format:");
          System.out.println("1 - YYYY/MM/DD");
          System.out.println("2 - YYYY.MM.DD");
        int format = input.nextInt();
        if (format == 1)
            System.out.println("Your date is" + " " + year + "/" + month + "/" + date);
        else {
            System.out.println("Your date is" + " " + year + "." + month + "." + date);
        }
    }
}