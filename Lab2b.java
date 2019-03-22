
package lab2b;
import java.util.Scanner;

public class Lab2b {


    public static void main(String[] args) {
        int dollars = 100, halfDollars = 50, quarters = 25, dimes = 10, nickels = 5, pennies = 1;
        float total = 0;
      
      
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the total in dollars and cents (example: 1.25):");
        total = in.nextFloat();
        total = total*100;
      
       
        
           dollars = (int) (total/100);
           total = (int) total%100;
        
      
        
           halfDollars = (int) (total/50);
           total = (int) (total% 50);
        
       
        
           quarters = (int) (total/25);
           total = (int) (total% 25);
        
        
        
           dimes = (int) (total/10);
           total = (int) (total% 10);
        
        
        
           nickels = (int) (total/5);
           total = (int) (total% 5);
        
        
        
           pennies = (int) (total/1);
           
        
        
        System.out.println("Dollars: " + dollars);
        System.out.println("Half-Dollars: " + halfDollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        
  

    }
    
}
