

//2. Display the smallest number from a collections of number

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = s.nextInt();

        System.out.print("Enter second number: ");
        int b = s.nextInt();

        System.out.print("Enter third number: ");
        int c = s.nextInt();

        System.out.print("Enter forth number: ");
        int d = s.nextInt();

        int min=0;

        if (a > b){
            min=b;
        }else{
            min=a;
        }

        if (c < min){
            min=c;
        }

        if (d < min){
            min=d;
        }

        System.out.println("The smallest number was: " +min);
    }
}
