# Lab2B

## Overview
Lab2B is a very simple change calculator program. This was one of the first programming assignments I completed in Java, so it taught me a lot about the language. This program covers the basics of using integer variables, float variables, and using a Scanner.

## Usage
Theoretically, this program could be used in a business to convert a dollar amount into all coins, however, there are more optimal ways to do that than this program. This program will take a dollar and change amount and convert it into the proper amount of coins, always using as many of the higher coin as possible before proceeding down the coin tier.

### Specifics
This program takes a float variable total, and casts it as an integer. It grabs the inital dollar amount by taking an integer variable "dollars" and dividing the total by 100. For example: 
          total = in.nextFloat();
          total = total*100;

          dollars = (int) (total/100);
          total = (int) total%100;
         
It then follows down the coin tier list starting with half dollars, casting it as an integer, then re-grabbing the total as necessary. For example:  
           halfDollars = (int) (total/50);
           total = (int) (total% 50);
This same procedure is done down to pennies.           
