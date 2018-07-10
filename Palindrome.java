

//4. Check if a number is palindrome( e.g palindrome 1221, 34143)

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner s=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n =s.nextInt();

        int nRev = 0;
        int num = n;

        while (n > 0){
            int r = n%10;
            nRev = nRev*10+r;
            n = n/10;
        }

        if (num==nRev){
            System.out.println("Number "+num+" is palindrome");
        }else{
            System.out.println("Number "+num+" is't palindrome");
        }


    }

}
