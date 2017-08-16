import java.util.Scanner;

public class MetricConversion {

    public static void main(String[] args) {
        int number;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter number to be converted: ");
        number = inputDevice.nextInt();
        inchesToCentimeters(number);
        gallonsToLitres(number);
    }
    public static void inchesToCentimeters(int inches) {
        double centimeters;
        final double CENTCONVERT = 2.54;
        centimeters = inches * CENTCONVERT;
        System.out.printf("%s inches is %s centimeters", inches, centimeters);
    }
    public static void gallonsToLitres(int gallons){
        double litres;
        final double LITRECONVERT = 3.78;
        litres = gallons * LITRECONVERT;
        System.out.printf(" %s gallons is %s litres", gallons, litres);
    }
}
