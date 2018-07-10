

/* Write pseudo code that will perform the following.
a) Read in 5 separate numbers.
b) Calculate the average of the five numbers.
c) Find the smallest (minimum) and largest (maxi
mum) of the five entered numbers.
d) Write out the results found from steps b and c with
    a message describing what they are */


import java.util.Scanner;

public class NumbersAvgMinMax {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = s.nextInt();

        System.out.print("Enter second number: ");
        int b = s.nextInt();

        System.out.print("Enter third number: ");
        int c = s.nextInt();

        System.out.print("Enter forth number: ");
        int d = s.nextInt();

        System.out.print("Enter fifth number: ");
        int e = s.nextInt();

        int avg = (a + b + c + d + e) / 5;

        int max;

        System.out.println("The average of your numbers is: " + avg);

        if (a < b){
            max=b;
        }else{
            max=a;
        }

        if (c > max){
            max=c;
        }

        if (d > max){
            max=d;
        }

        if (e > max ){
            max=e;
        }

        System.out.println("The biggest number was: " + max);

        int min;

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

        if (e < min ){
            min=e;
        }

        System.out.println("The smallest number was: " + min);

    }




}
