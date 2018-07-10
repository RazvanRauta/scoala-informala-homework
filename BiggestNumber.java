

//8. Input 3 numbers, and display the biggest

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = s.nextInt();

        System.out.print("Enter second number: ");
        int b = s.nextInt();

        System.out.print("Enter third number: ");
        int c = s.nextInt();
        
        int max=0;

        if (a < b){
            max=b;
        }else{
            max=a;
        }

        if (c > max){
            max=c;
        }

        System.out.println("The biggest number was: " +max);
    }
}
