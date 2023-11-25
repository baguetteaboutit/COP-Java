import java.util.*;
// this java,util.*; imports the math library
public class App {

    public static void main(String[] args)
    {
        // I print out the desired prompt for the user
        System.out.println("Please enter the bill: ");
        
        // scanner is what lets me get an input from the user once the println is promted
        Scanner input = new Scanner(System.in);

        // nextdouble allows me to use any number after "."
        double bill = input.nextDouble();
    
        double gratuity = bill * 0.15; 

        double total = gratuity + bill;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}











//*2.5 (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.

//For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.

//--------------------------------------------------------------------

//Here is a sample run:

//Enter the subtotal and a gratuity rate: 10 15
//The gratuity is $1.5 and total is $11.5 

//--------------------------------------------------------------------