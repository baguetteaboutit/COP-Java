public class App {
    public static void main(String[] args) {
        System.out.println("Miles\tKilometers");
        
        double conversionFactor = 1.609;

        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * conversionFactor;
            System.out.printf("%d\t%.3f%n", miles, kilometers);
        }
    }
}
