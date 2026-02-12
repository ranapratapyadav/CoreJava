package com.rana.exception_handling.finance;

class FinancialTransaction
{
    public void processTransaction(double transactionAmount,long accountNumber)
    {
        try
        {
            if(transactionAmount <=0)
            {
                throw new IllegalArgumentException("Error processing transaction: Transaction amount must be positive.");
            }
            else{
                IO.print("Processing transaction...\n");
                IO.println("Transaction successful: Amount Rs."+transactionAmount+" transferred to account "+accountNumber);
            }
        }
        
        catch(IllegalArgumentException e)
        {
           IO.println("Error processing transaction: Transaction amount must be positive.");
        }
        catch(Exception e)
        {
            IO.println("Invalid input: Please enter a valid number for transaction amount.");
        }

    }
}