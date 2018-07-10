

//Read number n and print the first n numbers in Fibonacci sequence

import java.util.Scanner;

public class FibonacciSeq {

    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n =s.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        for(int i=1 ; i<=n; i++){
            System.out.print(fib1 + ",");
            int sum =fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
    }
}
