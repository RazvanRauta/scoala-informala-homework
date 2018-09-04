import java.util.InputMismatchException;
import java.util.Scanner;

public class TheTime {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("What time is it? ");

        int myHour = getHour();
        int myMinutes = getMinutes();

        if (validateTime(myHour, myMinutes)) {

            System.out.println("The time is: " + myHour + ":" + myMinutes);
        }
    }

    public static int getHour() {
        int hour = 0;
        System.out.print("Enter hour: ");
        try {
             hour = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Input for Hour was invalid! It must be a number!" +"\nSystem will exit...");
            System.exit(1);
        }
        return hour;
    }

    public static int getMinutes() {
        int minutes = 0;
        System.out.print("Enter minutes: ");
        try {
            minutes = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Input for Minutes was invalid! It must be a number!" +"\nSystem will exit...");
            System.exit(1);
        }
        return minutes;
    }

    public static boolean validateTime(int hour, int minutes) {

        boolean val;

        if (hour < 0 || hour > 23) {
            System.out.println("Incorrect hour.Pleas try again");
            val = false;

        } else if (minutes < 0 || minutes > 59) {
            System.out.println("Incorrect minutes.Pleas try again");
            val = false;

        } else {
            val = true;
        }

        return val;
    }
}
