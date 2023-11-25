import java.util.Scanner;

public class Module78 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] values = new double[10];

		System.out.print("Enter ten doubled values: ");
		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextDouble();
		}

		System.out.println("The average value of the 10 numbers is: " + average(values));
	}

	public static int average(int[] array) {
		int average = 0; 
		for (int i: array)
			average += i;	
		return average / array.length;
	}   

	public static double average(double[] array) {
		double average = 0; 
		for (double i: array)
			average += i; 
		return average / array.length;
	}
}