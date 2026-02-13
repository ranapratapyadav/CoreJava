package com.rana.exception_handling1.agevalidationforvoting;


import java.util.Scanner;

public class CustomUncheckedException
{
    public static void main(String[] args) throws InvalidAgeException
    {
        Scanner sc=new Scanner(System.in);
        try(sc)
        {
             System.out.println("Enter the Age:");
            int age=sc.nextInt();

            if(age<18)
            {
                throw new InvalidAgeException("Age must be 18 or above to vote.");
            }

            else{
                System.out.println("You are eligible for vote.");
            }
        }
        catch(InvalidAgeException e)
        {
             e.printStackTrace();
//            System.out.println(e.getMessage());
        }
    }
}

@SuppressWarnings("serial")
class InvalidAgeException extends RuntimeException
{
    public InvalidAgeException()
    {

    }
    public InvalidAgeException(String errMessage)
    {
        super(errMessage);
    }
}