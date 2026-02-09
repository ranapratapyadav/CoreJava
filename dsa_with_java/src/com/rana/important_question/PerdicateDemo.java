package com.rana.important_question;

import java.util.function.*;

public class PerdicateDemo
{
    public static void main(String[] args)
    {
        Predicate<Integer> p1=num->num%2==0;
        Predicate <Integer>p2=num->num>10;
        Predicate<Integer>p3=num->
        {
            int count=0;
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                return true;
            }
            else{
                return false;
            }
        };

        int num=Integer.parseInt(IO.readln("Enter a number"));
        IO.println(num+" is even: "+p1.test(num));
        IO.println(num+" is greater than 10: "+p2.test(num));
        IO.println(num+" is prime: "+p3.test(num));
        
    }
}
