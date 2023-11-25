public class App {
    public static void main(String[] args) {
        double initialTuition = 10000; // Initial tuition amount
        double annualIncrease = 0.05; // 5% annual increase
        int numberOfYears = 10; // Number of years to calculate tuition for
        int yearsAfterTenthYear = 4; // Number of years after the tenth year

        double totalCostAfterTenthYear = 0;

        // Calculate tuition for ten years
        for (int i = 1; i <= numberOfYears; i++) {
            initialTuition += initialTuition * annualIncrease;
            if (i > 10) {
                // Calculate the total cost of four years' tuition after the tenth year
                totalCostAfterTenthYear += initialTuition;
            }
            System.out.printf("Year %d: $%.2f%n", i, initialTuition);
        }

        System.out.printf("Total cost of four years' tuition after the tenth year: $%.2f%n", totalCostAfterTenthYear);
    }
}








//**5.7 (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and increases 5% every year.
//In one year, the tuition will be $10,500.
//Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
