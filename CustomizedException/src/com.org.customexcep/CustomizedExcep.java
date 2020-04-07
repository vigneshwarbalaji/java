package com.org.customexcep;

public class CustomizedExcep 
{
    public static void deposit(double amount) throws InvalidAmountException
    {
        if (amount > 0) 
        {
            System.out.println("Transaction started......!!!");
        }
        else
        {
            throw new InvalidAmountException();
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("***************************************");

        try 
        {
            deposit(-10000.0);
        } 
        catch(InvalidAmountException e) 
        {
            e.reportFoulPlay();
        }

        System.out.println("****************************************");
    }
}