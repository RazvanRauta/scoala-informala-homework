import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FarmShop {

    private String name;
    private List<AnimalProd> myAnimalProducts;
    private List<VegetableProd> myVegProducts;


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

    public boolean removeAnimalProduct(AnimalProd animalProd) {
        int foundPosition = findAnimalProduct(animalProd);
        if (foundPosition < 0) {
            System.out.println(animalProd.getName() + ", was not found");
            return false;
        }

        this.myAnimalProducts.remove(foundPosition);
        System.out.println(animalProd.getName() + ", was deleted");
        return true;

    }

    public boolean removeVegetableProduct(VegetableProd vegetableProd) {
        int foundPosition = findVegetableProduct(vegetableProd);
        if (foundPosition < 0) {
            System.out.println(vegetableProd.getName() + ", was not found");
            return false;
        }

        this.myVegProducts.remove(foundPosition);
        System.out.println(vegetableProd.getName() + ", was deleted");
        return true;

    }

    public boolean displayAnimalProducts() {
        System.out.println("Shop's Inventory");
        if (!this.myAnimalProducts.isEmpty()) {
            System.out.println("Animal products: ");
            for (AnimalProd myAnimalProduct : this.myAnimalProducts) {
                System.out.println("ID: " +
                        myAnimalProduct.getId() +
                        " |Name: " +
                        myAnimalProduct.getName() +
                        " |Weight: " +
                        myAnimalProduct.getWeight() +
                        " |Price: " +
                        myAnimalProduct.getPrice() +
                        " |Storage Temp: " +
                        myAnimalProduct.getStoTemp() +
                        " |Expiration date: " +
                        myAnimalProduct.getExpDate() +
                        " |Added on: " +
                        myAnimalProduct.getAddDate());
            }

            return true;

        } else {
            System.out.println("No animal products!");

            return false;
        }

    }

    public boolean displayVegetableProducts() {

        if (!this.myVegProducts.isEmpty()) {

            System.out.println("Vegetable products: ");

            for (VegetableProd myVegProduct : this.myVegProducts) {
                System.out.println("ID: " +
                        myVegProduct.getId() +
                        " |Name: " +
                        myVegProduct.getName() +
                        " |Weight: " +
                        myVegProduct.getWeight() +
                        " |Price: " +
                        myVegProduct.getPrice() +
                        " |Vitamines: " +
                        myVegProduct.getVitamines() +
                        " |Carbohydrates" +
                        myVegProduct.getCarbo() +
                        " |Expiration date: " +
                        myVegProduct.getExpDate() +
                        " |Added on: " +
                        myVegProduct.getAddDate());
            }
            return true;
        } else {
            System.out.println("No vegetable products");
            return false;
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

    private int findAnimalProduct(Date date) {
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

    public AnimalProd searchByDateAnimal(Date date) {

        int position = findAnimalProduct(date);
        if (position >= 0) {
            return this.myAnimalProducts.get(position);
        }

        return null;
    }

    public AnimalProd searchAnimal(String id) {

        int position = findAnimalID(id);
        if (position >= 0) {
            return this.myAnimalProducts.get(position);
        }

        return null;
    }

    public VegetableProd searchByDateVegetable(Date date) {
        int position = findVegetableProduct(date);
        if (position >= 0) {
            return this.myVegProducts.get(position);
        }

        return null;
    }

    public VegetableProd searchVegetable(String id) {
        int position = findVegetableID(id);
        if (position >= 0) {
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
