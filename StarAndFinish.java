

//9. Input 2 values:  start  and  finish, then display the numbers from start to finish

import java.util.Scanner;

public class StarAndFinish {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number for start: ");
        int start = s.nextInt();

        System.out.print("Enter number for finish: ");
        int finish = s.nextInt();

        if (start<finish){

            System.out.print("The numbers are: ");

            for (int i=start; i<=finish; i++){

                System.out.print(i+",");
            }
        }else{

            System.out.println("Error!");
            System.out.println("Start number needs to be bigger than finish number!");
        }
    }
}
