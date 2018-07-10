
//Implement an arithmetic calculator!

/*  Info:
    Se introduc doua numere.
    Posibilitatea de a se alege una din operatiile: Adunare, Scadere, Inmultire si Impartire
    Se pot efectua mai multe operatii pe aceleasi numere.
    Se pot introduce numere noi.
    Posibilitatea de terminare a programului cu vointa utilizatorului sau la alegerea unei optiuni inexistente.
    */


import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {

        int x, y, buton;
        float rezultat = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Introduceti primul numar: ");
        x = s.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        y = s.nextInt();

        System.out.print("\nOperatii disponibile: \n");

        System.out.print("\n1: Adunare.\n2: Scadere.");
        System.out.print("\n3: Inmultire. \n4: Impartire.");
        System.out.println("\n5: Introduceti numere noi. \n6: Iesire.\n");

        System.out.print("Alegeti operatia din lista de mai sus: ");
        buton = s.nextInt();

        while (buton >= 1 && buton <= 5) {

            switch (buton) {
                case 1:
                    rezultat = x + y;
                    break;
                case 2:
                    rezultat = x - y;
                    break;
                case 3:
                    rezultat = x * y;
                    break;
                case 4:
                    rezultat = (float)x / (float)y;
                    break;
                case 5:
                    System.out.print("Introduceti noul numar: ");
                    x=s.nextInt();

                    System.out.print("Introduceti al doilea numar nou: ");
                    y=s.nextInt();
                    break;


            }

            if (buton >= 1 && buton <= 4) {
                System.out.println("\nRezultatul este: " + rezultat);
            }
            System.out.print("\nAlegeti operatia din lista de mai sus: ");
            buton = s.nextInt();
        }

        switch (buton){
            case 6:
                System.out.println("Programul se opreste! :( ");
                break;
            default:
                System.out.println("Optiunea nu exista!Programul se opreste! :(");
                break;
        }
    }
}
