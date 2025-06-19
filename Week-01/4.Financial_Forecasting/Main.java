public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05; // 5% growth
        int years = 5;

        double resultRecursive = FinancialForecast.forecastRecursive(initialValue, growthRate, years);
        System.out.printf("Future Value (Recursive): %.2f%n", resultRecursive);

        double resultOptimized = FinancialForecast.forecastOptimized(initialValue, growthRate, years);
        System.out.printf("Future Value (Optimized Recursion): %.2f%n", resultOptimized);
    }
}
