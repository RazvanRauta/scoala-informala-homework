
import java.util.Scanner;

public class TempConv {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int myTemp = getTemperature();

        int myConvTemp = calcInCelsius(myTemp);

        System.out.println("The temperature " + myTemp + "°F" + " in Celsius is " + myConvTemp
                            + "°C");

        if (myConvTemp > 37){

            System.out.println("You are ill! See the doctor!");
        }

    }

    public static int getTemperature(){
        System.out.println("Enter temperature in Fahrenheit: ");
        int tempInF = scanner.nextInt();
        return tempInF;
    }

    public static int calcInCelsius(int temp){

        int celsius = (int) ((temp - 32) * 0.5556);

        return celsius;


    }
}
