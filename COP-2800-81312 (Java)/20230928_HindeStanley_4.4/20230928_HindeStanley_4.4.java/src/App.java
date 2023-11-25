import java.util.Scanner;
import java.lang.Math;
public class App {
    public static void main(String[] args) {
        
        double pi = Math.PI;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();
        
        scanner.close();

        double tangentval = Math.tan(pi / 6);
        double area = (6 * Math.pow(side, 2)) / (4 * tangentval);

        System.out.println("The area of the hexagon is " + area);

    }
}


//double tangentval = Math.tan(pi / 6);
//double area = (6 * Math.sqrt(side)) / (4 * tangentval);
