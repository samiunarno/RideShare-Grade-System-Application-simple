public class rideshare {

    private static final double Day_base = 10.0;
    private static final double Night_base = 11.0;
    private static final double per_km_rate = 4.0;
    private static final double day_rate_km = 1.9;
    private static final double night_rate_km = 2.2;

    public boolean isDayTime (int hour){
        return hour >= 7 && hour<23;
    }

    public double calculatefare(double distance, int hour){
        
    }
}
