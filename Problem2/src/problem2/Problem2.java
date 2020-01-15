/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import java.util.Scanner;
/**
 *
 * @author Evan
 */
public class Problem2 {

    /**
     * Main method
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter a number."); //User input
       int number = scan.nextInt();
       
       int calc = reduceDivide(number); //Logic
       
       if (calc == 3 || calc == 6 || calc == 9) //Output
       {
           System.out.println(number + " is divisible by 3.");
       }
       else
       {
           System.out.println(number + " is not divisible by 3.");
       }
    }
    
    /**
     * Add the digits of an integer together
     * 
     * @param n The integer whose digits you are adding
     * @return The sum of the digits
     */
    public static int addDigits(int n)
    {
        int sum = 0;
        String calcString = Integer.toString(n); //Convert to string
        for (int i = 0; i < calcString.length(); i++)
        {
            sum += Integer.parseInt(Character.toString(calcString.charAt(i))); //Split string into individual characters and add them together
        }
        return sum;
    }
    
    /**
     * Reduce a number by adding the digits until there is only one digit
     * 
     * @param n The input number
     * @return The number, reduced to one digit
     */
    public static int reduceDivide(int n)
    {
       while (n >= 10) //If there is more than 1 digit, add the digits together
       {
           n = addDigits(n);
       }
       return n;
    }
    
}
