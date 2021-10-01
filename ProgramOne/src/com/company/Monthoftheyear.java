package com.company;

import java.util.Scanner;

public class Monthoftheyear {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any number between 1 and 365:");
            int day = input.nextInt();
            if ((day >= 0) && (day < 31)) {
                System.out.println("January");
            }
            if ((day >= 32) && (day < 59)) {
                System.out.println("February");
            }
            if ((day >= 60) && (day < 90)) {
                System.out.println("March");
            }
            if ((day >= 91) && (day < 120)) {
                System.out.println("April");
            }
            if ((day >= 121) && (day < 151)) {
                System.out.println("May");
            }
            if ((day >= 152) && (day < 181)) {
                System.out.println("June");
            }
            if ((day >= 182) && (day < 212)) {
                System.out.println("July");
            }
            if ((day >= 213) && (day < 243)) {
                System.out.println("August");
            }
            if ((day >= 244) && (day < 273)) {
                System.out.println("September");
            }
            if ((day >= 274) && (day < 304)) {
                System.out.println("October");
            }
            if ((day >= 305) && (day < 334)) {
                System.out.println("November");
            }
            if ((day > 335) && (day < 365)) {
                System.out.println("December");
            }
        }
    }

