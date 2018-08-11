
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
        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();
        return hour;
    }

    public static int getMinutes() {
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        return minutes;
    }

    public static boolean validateTime(int hour, int minutes) {

        boolean val;

        if (hour < 0 || hour > 23) {

            System.out.println("Incorrect hour.Please try again");
            val = false;

        } else if (minutes < 0 || minutes > 59) {

            System.out.println("Incorrect minutes.Please try again");
            val = false;

        } else {
            val = true;
        }

        return val;
    }
}
