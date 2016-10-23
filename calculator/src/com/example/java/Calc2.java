package com.example.java;

import java.util.Scanner;

/**
 * Created by Eric on 10/22/2016.  Refactoring from previous attempt with better
 * Init / Input / Transform / Output flow.
 */
public class Calc2 {

    public static void main(String[] args) {
        String in1 = getInput("Enter a numeric value: ");
        String in2 = getInput("Enter another numeric value: ");
        String op = getInput("Enter an operator: ");
        double result;
        try {
            result = calcResult(in1, in2, op);
        } catch (Exception e) {
            System.out.println("Invalid input " + e.getMessage());
            return;
        }
        displayResult(result);
    }

    private static String getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextLine();
    }

    private static double calcResult(String in1, String in2, String op) throws Exception {
        double result;
        double input1 = Double.parseDouble(in1);
        double input2 = Double.parseDouble(in2);
        switch (op) {
            case "+":
                result = input1 + input2;
                break;
            case "*":
                result = input1 * input2;
                break;
            case "-":
                result = input1 - input2;
                break;
            case "/":
                result = input1 / input2;
                break;
            default:
                throw (new Exception("operator " + op));
        }
        return result;
    }

    private static void displayResult(double result) {
        System.out.println("The result is: " + result);
    }
}
