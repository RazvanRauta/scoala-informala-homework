public class AnimalProd extends Product {
    private double stoTemp;

    public AnimalProd(String id, String name, double price, double weight, String expDate, double stoTemp) {
        super(id, name, price, weight, expDate);
        this.stoTemp = stoTemp;
    }

    public double getStoTemp() {
        return stoTemp;
    }

    public static AnimalProd createAnimalProduct(String id, String name, double price, double weight, String expDate, double stoTemp) {

        return new AnimalProd(id,name,price,weight,expDate,stoTemp);
    }
}
