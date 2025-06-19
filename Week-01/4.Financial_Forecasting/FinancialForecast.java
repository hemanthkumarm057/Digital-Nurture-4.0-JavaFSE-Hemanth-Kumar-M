public class FinancialForecast {

    public static double forecastRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return forecastRecursive(initialValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static double forecastOptimized(double initialValue, double growthRate, int years) {
        return helper(initialValue, growthRate, years);
    }

    private static double helper(double value, double growthRate, int years) {
        if (years == 0) return value;
        return helper(value * (1 + growthRate), growthRate, years - 1);
    }
}
