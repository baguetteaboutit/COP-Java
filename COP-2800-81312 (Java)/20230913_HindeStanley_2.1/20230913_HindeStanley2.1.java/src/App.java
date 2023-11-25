import java.util.*;
// this java,util.*; imports the math library
public class App {

    public static void main(String[] args)
    {
        // I print out the desired prompt for the user
        System.out.println("Please enter a degree in Celsius: ");
        
        // scanner is what lets me get an input from the user once the println is promted
        Scanner input = new Scanner(System.in);

        // nextdouble allows me to use any number after "."
        double celsius = input.nextDouble();
    
        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}





// 2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:

//fahrenheit = (9 / 5) * celsius + 32

//Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.

//-------------------------------------------------------------------

//Here is a sample run:

//Enter a degree in Celsius: 43
//43 Celsius is 109.4 Fahrenheit

//--------------------------------------------------------------------