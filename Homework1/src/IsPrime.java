

//5. Display all the prime numbers lower than a given number

import java.util.Scanner;

public class IsPrime {
    public static void main(String abc[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n =s.nextInt();
        int p=0;

        if(n>=2){
            System.out.print("The prime numbers until "+n+" are: 2,");
        }

        for (int i = 1; i<=n; i++)
        {
            for (int j = 2; j<i; j++)
            {
                if(i%j != 0)
                {p = 1;}
                else
                {p = 0;
                    break;}

            }
            if(p == 1)
                System.out.print(i+",");
        }
    }
}
