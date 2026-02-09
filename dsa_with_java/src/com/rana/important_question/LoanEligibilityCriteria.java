package com.rana.important_question;

import java.util.function.Predicate;

public class LoanEligibilityCriteria
{
    public static void main(String[] args)
    {
        String name=IO.readln();
        double salary=Double.parseDouble(IO.readln());
        double creditScore=Double.parseDouble(IO.readln());
        int age=Integer.parseInt(IO.readln());
        Customer cust=new Customer(name,salary,creditScore,age);
        System.out.println(cust);

        Predicate<Customer> eligible =c->c.salary()>25000 && c.creditScore()>700 && c.age()>21;

        if(eligible.test(cust))
        {
            IO.println(cust.name()+" is Eligible for Loan...");
        }
        else
        {

            IO.println(cust.name()+" is NOT Eligible for Loan...");
        }

    }
}

//canonical constructor
record Customer(String name,Double salary,Double creditScore,Integer age)
{
   //compact constructor
//	public Customer {
//			if(!name.equals("sdf")) {
//				System.err.println("Error");
//				System.exit(0);
//			}
//	}
	
}