import java.util.Scanner;

public class Moduel65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);

        input.close();
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("The numbers in increasing order are: " + num1 + ", " + num2 + ", " + num3);
    }
}








//(Sort three numbers) Write a method with the following header to display three numbers in increasing order:
//public static void displaySortedNumbers(double num1, double num2, double num3)
//Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.