import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();
       
        System.out.print("Enter your height in feet: ");
        int feet = scanner.nextInt();
        System.out.print("Enter your height in inches: ");
        int inches = scanner.nextInt();
        
        scanner.close();

        int totalinches = feet * 12 + inches;

        double bmi = (weight / (totalinches * totalinches)) * 703;

        System.out.println("Your BMI is " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
