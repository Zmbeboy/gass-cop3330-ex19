/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your height in inches");
        String height = scan.nextLine();
        System.out.print("What is your weight in pounds");
        String weight = scan.nextLine();

        double inches = Double.parseDouble(height);
        double pounds = Double.parseDouble(weight);

        double bmi = (pounds / (inches * inches)) * 703;
        System.out.println(String.format("Your BMI is %.1f.", bmi));
        if (bmi > 25) {
            System.out.println(String.format("You are overweight. You should see your doctor."));
        } else if (bmi < 18.5) {
            System.out.println(String.format("You are underweight. You should see your doctor."));
        } else {
            System.out.println(String.format("You are within the ideal weight range."));
        }
    }
}