//max number
import java.util.Scanner;

public class MaxNumber {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] myIntegers = getIntegers(3); //you can change to "n" numbers to find aut the max.
        System.out.println("The maximum number is " + getMax(myIntegers));

    }


    public static int[] getIntegers(int number) {   //getIntegers() is a method to read "n" numbers from the keyboard
        System.out.println("Enter " + number + " numbers. \r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static int getMax(int[] array){  //getMax() is a method to find the maximum from "n" numbers.
        int max = 0;
        for (int i =0;i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }
}
