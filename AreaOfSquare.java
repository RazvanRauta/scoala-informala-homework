

// 7. Input the length of the side of a square, and display its area.  Produce an error message if the length is negative

import java.util.Scanner;

public class AreaOfSquare {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter square's side length: ");
        int length = s.nextInt();

        int area=0;

        if (length > 0){

            area=length*length;

            System.out.println("Square's area is: " + area);

        }else{
            System.out.println("The value cannot be smaller or equal to 0");
        }
    }
}


