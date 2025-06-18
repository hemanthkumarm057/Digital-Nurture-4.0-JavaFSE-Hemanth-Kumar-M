public class Forecaster {
    public double[] forecastNextMonths(FinancialData data, int monthsToForecast) {
        double[] past = data.getPastRevenue();
        int n = past.length;

        double totalGrowth = 0;
        for (int i = 1; i < n; i++) {
            totalGrowth += (past[i] - past[i - 1]);
        }
        double avgGrowth = totalGrowth / (n - 1);

        double[] forecast = new double[monthsToForecast];
        double lastValue = past[n - 1];
        for (int i = 0; i < monthsToForecast; i++) {
            lastValue += avgGrowth;
            forecast[i] = lastValue;
        }
        return forecast;
    }
}
