

//1.Calculate the sum of the first 100 numbers higher than 0

public class SumFirst100 {

    public static void main(String[] args){

        int sum = 0;

        for (int i = 1; i<=100; i++) {

            sum += i;
        }

        System.out.println("The sum of first 100 numbers higher than 0 is: " + sum);
    }
}
