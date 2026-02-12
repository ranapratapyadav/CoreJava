package com.rana.exception_handling1;



/*
 Command Line Division with Exception Handling

Objective:
Write a Java program that processes command line arguments, handles exceptions for invalid inputs and division by zero, 
and demonstrates the use of nested try-catch blocks with a finally block for cleanup.

Instructions:
-------------

-> Create a ELC class named CommandLineDivision.

-> Implement the main method that:
   Checks if exactly two command line arguments are provided.
   Parses these arguments into integers (dividend and divisor).
   Uses nested try-catch blocks:
   Outer block catches IllegalArgumentException for insufficient arguments or invalid input types (NumberFormatException).
   Inner block attempts the division and catches ArithmeticException for division by zero.
   Prints the result of the division if successful.
   Includes a finally block to print "Division operation completed."

-> Test the program with different scenarios:
   a) Provide valid integers for division.
   b) Test division by zero scenario.
   c) Test with invalid input types (non-integer values).


TEST CASE 1 : 
-------------
CommandLine Inputs : java CommandLineDivisionQuestion 10 2
Expected Output:
Division result: 5.0
Division operation completed.


TEST CASE 2 : 
-------------
CommandLine Inputs : java CommandLineDivisionQuestion 8 0
Expected Output:
Arithmetic error: / by zero
Division operation completed.


TEST CASE 3 : 
-------------
CommandLine Inputs : java CommandLineDivisionQuestion 12 abc
Expected Output:
NumberFormatException: For input string: "abc"
Division operation completed.

Examples
Example 1
Input:
10 2
Output:
Division result: 5.0
Division operation completed.
 */



import java.util.Scanner;

public class CommandLineDivisionQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String input1 = sc.next();

            System.out.print("Enter second number: ");
            String input2 = sc.next();

            // Convert to integer (may throw NumberFormatException)
            int dividend = Integer.parseInt(input1);
            int divisor = Integer.parseInt(input2);

            try {
                double result = (double) dividend / divisor;
                System.out.println("Division result: " + result);
            } 
            catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e.getMessage());
            }

        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } 
        finally {
            System.out.println("Division operation completed.");
            sc.close();
        }
    }
}
