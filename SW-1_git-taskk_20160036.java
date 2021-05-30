/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task1;

/**
 *
 * @author Ahmed Yassein
 */
import java.util.*;
public class Task1{

    public int GetFactorial(int number)
    {
        int factorial=1;
        for(int i=1;i<= number;i++)
            factorial= factorial*i;
        return factorial;
    }
    
    public boolean CheckIsPrime(int number) {
        if (number == 0 || number == 1)
            return false;
        else {
            for (int i = 2;i <= number/2;i++)
            {
                if(number%i ==0)
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Task1 obj = new Task1();
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("enter a number from 0 to 100 :");
        try
        {
            number = input.nextInt();
        if (number >= 0 && number <= 100) {
            System.out.println("the number is valid ");
            if (obj.CheckIsPrime(number)) {
                System.out.println("this is prime number");
            } else
                System.out.println("this is not prime number");

            if (number % 2 == 0)
                System.out.println("this is even number");
            else
                System.out.println("this is odd number");

            if (number % 5 == 0)
                System.out.println("this number can be divided by 5");
            else
                System.out.println("this number not divisible by 5");

            System.out.println("The Factorial of " + number + " = " + obj.GetFactorial(number));

        } else
            System.out.println("This number is not valid...");
    }
        catch (Exception e)
        {
            System.out.println("This is not valid");
        }
    }
    
}
