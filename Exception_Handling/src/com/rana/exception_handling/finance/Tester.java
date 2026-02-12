package com.rana.exception_handling.finance;

public class Tester 
{
    public static void main(String[] args)
    {
        try
        {
        double transactionAmount=Double.parseDouble(IO.readln("Enter the amount:"));
        long accountNumber=Long.parseLong(IO.readln("Enter the account number:"));
        FinancialTransaction ft=new FinancialTransaction();
        ft.processTransaction(transactionAmount,accountNumber);

        }
        catch(NumberFormatException e)
        {
             IO.println("Invalid input: Please enter a valid number for transaction amount.");
        }
    }
}