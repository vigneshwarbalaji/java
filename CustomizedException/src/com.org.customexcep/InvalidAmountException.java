package com.org.customexcep;



class InvalidAmountException extends Exception
{
    InvalidAmountException()
    {
        super();
        System.out.println("Invalid Amount Exception object created.....!!!");
    }

    void reportFoulPlay()
    {
        System.out.println("Security breached in your account");
    }
}