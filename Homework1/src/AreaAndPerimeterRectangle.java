

//6. Input the dimensions of a rectangle and display area and perimeter

import java.util.Scanner;

public class AreaAndPerimeterRectangle {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter rectangle's length: ");
        int length = s.nextInt();

        System.out.print("Enter rectangle's width: ");
        int width = s.nextInt();

        int area=0;
        int perimeter=0;

        if ( length !=0 && width !=0 ){

             area = length * width;

             perimeter = 2*(length+width);

            System.out.println("Rectangle's area is: " + area);
            System.out.println("Rectangle's perimeter is: " + perimeter);

        }else{
            System.out.println("Wrong parameters");
        }
    }
}
