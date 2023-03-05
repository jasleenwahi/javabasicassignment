package com.knoldus.Question10;

public class LogicalOperators
{
    public static void main(String args[])
    {
        boolean isCold = true;
        boolean isRainy = false;
        //checking conditions
        if(isCold == true && isRainy == true)
        {
            System.out.println("Bring a jacket and an umbrella");
        }
        if(isCold == true)
        {
            System.out.println("Bring a Jacket");
        }
        if(isRainy == true)
        {
            System.out.println("Bring an umbrella");
        }
    }
}
