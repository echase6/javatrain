package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String input1 = sc.nextLine();
        System.out.print("Enter second number: ");
        String input2 = sc.nextLine();
        System.out.print("Enter operator: ");
        String operator = sc.nextLine();
        calcResult(input1, input2, operator);

    }

    private static void calcResult(String input1, String input2, String operator) {
        double in1;
        double in2;
        try {
            in1 = Double.parseDouble(input1);
            in2 = Double.parseDouble(input2);
            calcForReal(in1, in2, operator);
        } catch (NumberFormatException e) {
            System.out.println("Number is not formatted correctly");
        } catch (Exception e) {
            System.out.println("Operator not valid.");
        }
    }

    private static void calcForReal(double in1, double in2, String operator) throws Exception {
        switch (operator) {
            case "*":
                System.out.println("Result is " + in1 * in2);
                break;
            case "+":
                System.out.println("Result is " + in1 * in2);
                break;
            case "-":
                System.out.println("Result is " + in1 * in2);
                break;
            case "/":
                System.out.println("Result is " + in1 * in2);
                break;
            default:
                throw (new Exception("Operator not valid"));
        }
    }
}
