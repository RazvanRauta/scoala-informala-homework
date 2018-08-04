import java.util.ArrayList;
import java.util.Date;

public class FarmShop {

    private String name;
    private ArrayList<AnimalProd> myAnimalProducts;
    private ArrayList<VegetableProd> myVegProducts;

    public FarmShop(String name) {
        this.name = name;
        this.myAnimalProducts = new ArrayList<AnimalProd>();
        this.myVegProducts = new ArrayList<VegetableProd>();
    }

    public boolean addNewAnimalProd(AnimalProd animalProd) {
        if (findAnimalProduct(animalProd.getName()) >= 0) {
            System.out.println("Product is already in the store");
            return false;
        }

        myAnimalProducts.add(animalProd);
        return true;
    }

    public boolean addNewVegetableProduct(VegetableProd vegetableProd) {

        if (findVegetableProduct(vegetableProd.getName()) >= 0) {
            System.out.println("Product is already in the store ");
            return false;
        }

        myVegProducts.add(vegetableProd);
        return true;
    }

    public boolean removeAnimalProduct(AnimalProd animalProd){
        int foundPosition = findAnimalProduct(animalProd);
        if (foundPosition<0){
            System.out.println(animalProd.getName() + ", was not found");
            return false;
        }

        this.myAnimalProducts.remove(foundPosition);
        System.out.println(animalProd.getName() + ", was deleted");
        return true;

    }

    public boolean removeVegetableProduct(VegetableProd vegetableProd){
        int foundPosition = findVegetableProduct(vegetableProd);
        if (foundPosition<0){
            System.out.println(vegetableProd.getName() + ", was not found");
            return false;
        }

        this.myVegProducts.remove(foundPosition);
        System.out.println(vegetableProd.getName() + ", was deleted");
        return true;

    }

    public void displayProducts() {

        System.out.println("Shop's Inventory");
        System.out.println("Animal products: ");
        if (this.myAnimalProducts.size()>0) {
            for (int i = 0; i < this.myAnimalProducts.size(); i++) {
                System.out.println("ID: " +
                        this.myAnimalProducts.get(i).getId() +
                        " |Name: " +
                        this.myAnimalProducts.get(i).getName() +
                        " |Weight: " +
                        this.myAnimalProducts.get(i).getWeight() +
                        " |Price: " +
                        this.myAnimalProducts.get(i).getPrice() +
                        " |Storage Temp: " +
                        this.myAnimalProducts.get(i).getStoTemp() +
                        " |Expiration date: " +
                        this.myAnimalProducts.get(i).getExpDate() +
                        " |Added on: " +
                        this.myAnimalProducts.get(i).getAddDate());
            }
        }

        System.out.println("Vegetable products: ");

        if (this.myVegProducts.size()>0) {

            for (int i = 0; i < this.myVegProducts.size(); i++) {
                System.out.println("ID: " +
                        this.myVegProducts.get(i).getId() +
                        " |Name: " +
                        this.myVegProducts.get(i).getName() +
                        " |Weight: " +
                        this.myVegProducts.get(i).getWeight() +
                        " |Price: " +
                        this.myVegProducts.get(i).getPrice() +
                        " |Vitamines: " +
                        this.myVegProducts.get(i).getVitamines() +
                        " |Carbohydrates" +
                        this.myVegProducts.get(i).getCarbo() +
                        " |Expiration date: " +
                        this.myVegProducts.get(i).getExpDate() +
                        " |Added on: " +
                        this.myAnimalProducts.get(i).getAddDate());
            }
        }
    }

    private int findAnimalProduct(AnimalProd animalProd) {

        return this.myAnimalProducts.indexOf(animalProd);
    }

    private int findAnimalProduct(String animalProductName) {

        for (int i = 0; i < this.myAnimalProducts.size(); i++) {
            AnimalProd animalProd = this.myAnimalProducts.get(i);
            if (animalProd.getName().equals(animalProductName)) {
                return i;
            }
        }

        return -1;

    }

    private int findAnimalID(String animalId) {

        for (int i = 0; i < this.myAnimalProducts.size(); i++) {
            AnimalProd animalProd = this.myAnimalProducts.get(i);
            if (animalProd.getId().equals(animalId)) {
                return i;
            }
        }

        return -1;

    }

    private int findVegetableID(String vegetableId) {

        for (int i = 0; i < this.myVegProducts.size(); i++) {
            VegetableProd vegetableProd = this.myVegProducts.get(i);
            if (vegetableProd.getId().equals(vegetableId)) {
                return i;
            }
        }

        return -1;

    }

    private int findAnimalProduct(Date date){
        for (int i = 0; i < this.myAnimalProducts.size(); i++) {
            AnimalProd animalProd = this.myAnimalProducts.get(i);
            if (animalProd.getAddDate().equals(date)) {
                return i;
            }
        }

        return -1;
    }

    private int findVegetableProduct(Date date) {
        for (int i = 0; i < this.myVegProducts.size(); i++) {
            VegetableProd vegetableProd = this.myVegProducts.get(i);
            if (vegetableProd.getAddDate().equals(date)) {
                return i;
            }
        }

        return -1;
    }

    public AnimalProd searchByDateAnimal(Date date){

        int position = findAnimalProduct(date);
        if (position >=0) {
            return this.myAnimalProducts.get(position);
        }

        return null;
    }

    public AnimalProd searchAnimal(String id){

        int position = findAnimalID(id);
        if (position >=0) {
            return this.myAnimalProducts.get(position);
        }

        return null;
    }

    public VegetableProd searchByDateVegetable(Date date){
        int position = findVegetableProduct(date);
        if (position >=0) {
            return this.myVegProducts.get(position);
        }

        return null;
    }

    public VegetableProd searchVegetable(String id){
        int position = findVegetableID(id);
        if (position >=0) {
            return this.myVegProducts.get(position);
        }

        return null;
    }


    private int findVegetableProduct(VegetableProd vegetableProd) {

        return this.myVegProducts.indexOf(vegetableProd);
    }

    private int findVegetableProduct(String vegetableProductName) {

        for (int i = 0; i < this.myVegProducts.size(); i++) {
            VegetableProd vegetableProd = this.myVegProducts.get(i);
            if (vegetableProd.getName().equals(vegetableProductName)) {
                return i;
            }
        }

        return -1;
    }
}
