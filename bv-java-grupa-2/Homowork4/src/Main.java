import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static FarmShop farmShop = new FarmShop("Sergiana");

    public static void main(String[] args) {

        boolean quit = false;
        printActions();
        while (!quit) {
            System.out.println("\nEnter action: (4 - to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.println("Product type ( 1 - Animal | 2 - Vegetable ");
                    int action2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (action2) {
                        case 1:
                            addNewAnimalProduct();
                            break;
                        case 2:
                            addNewVegetableProduct();
                            break;
                        default:
                            System.out.println("Action not available.Try again!");
                            break;
                    }
                    break;
                case 2:
                    farmShop.displayProducts();
                    System.out.println("Enter product id: ");
                    String id = scanner.nextLine();
                    System.out.println("Enter quantity: ");
                    int  q = scanner.nextInt();
                    break;
                case 3:
                    displayDailySales();
                    break;
                case 4:
                    printActions();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    quit = true;
                    break;
            }
        }

    }

    private static void addNewAnimalProduct() {
        System.out.println("Enter product id: ");
        String id = scanner.nextLine();
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter storage temperature: ");
        double temp = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter expiration date in format: YYYY-MM-DD: ");
        String expDate = scanner.nextLine();
        AnimalProd newProduct = AnimalProd.createAnimalProduct(id, name, price, weight, expDate, temp);
        if (farmShop.addNewAnimalProd(newProduct)) {
            System.out.println("New product added: " + name);
        }else{
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void addNewVegetableProduct() {
        System.out.println("Enter product id: ");
        String id = scanner.nextLine();
        System.out.println("Enter product name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter vitamins: ");
        String vitamins = scanner.nextLine();
        System.out.println("Enter number of Carbohydrates: ");
        double carbo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter expiration date in format: YYYY-MM-DD ");
        String expDate = scanner.nextLine();

        VegetableProd newProduct = VegetableProd.createVegetableProduct(id, name, price, weight, expDate, vitamins,carbo);
        if (farmShop.addNewVegetableProduct(newProduct)) {
            System.out.println("New product added: " + name);
        }else{
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress:");
        System.out.println("1 - Create product and add it to stock\n" +
                "2 - Sell product\n" +
                "3 - Display daily sales report\n" +
                "4 - To print a list of available actions\n" +
                "5 - Exit");
        System.out.println("Choose your action : \n");
    }

    private static void displayDailySales() {
        System.out.println("Enter date in YYYY-MM-DD format: ");
        DateFormat format = new SimpleDateFormat("YYYY-MM-DD");
        Date date = null;
        while (date == null) {
            String line = scanner.nextLine();
            try{
                date = format.parse(line);
                }catch (ParseException e) {
                System.out.println("Invalid date,Try again!");
            }
        }

        farmShop.searchByDateAnimal(date);
        farmShop.searchByDateVegetable(date);


    }

}

