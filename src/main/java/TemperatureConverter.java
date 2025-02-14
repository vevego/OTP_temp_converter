
public class TemperatureConverter {

    public static int farenheitToCelcius(int f) {
        int c=  (int)((f-32) * 5.0/9.0);
        return c;
    }

    //This method convert thr cel to fsh
    public static int celsiusToFarenheit(int c){
        return (int) ((c * 9.0 / 5.0) + 32);
    }

    public static boolean isExtremeTemperature(int celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static void main(String [] args) {
// Test convertFahr method
        int fahrenheit = 212;
        int celsius = farenheitToCelcius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius.");

        // Test convertCel method
        int cel = 100;
        int fahr = celsiusToFarenheit(cel);
        System.out.println(cel + " Celsius is equal to " + fahr + " Fahrenheit.");


    }
}