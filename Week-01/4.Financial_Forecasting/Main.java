import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] pastRevenue = new double[3];
        System.out.println("Enter revenue for the past 3 months:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Month " + (i + 1) + ":");
            pastRevenue[i] = scanner.nextDouble();
        }

        FinancialData data = new FinancialData(pastRevenue);
        Forecaster forecaster = new Forecaster();
        double[] forecast = forecaster.forecastNextMonths(data, 3);

        System.out.println("\nForecasted Revenue for Next 3 Months:");
        for (int i = 0; i < forecast.length; i++) {
            System.out.printf("Month %d: %.2f\n", i + 4, forecast[i]);
        }

        scanner.close();
    }
}
