public class VegetableProd extends Product {
    private String vitamines;
    private double carbo;

    public VegetableProd(String id, String name, double price, double weight, String expDate, String vitamines, double carbo) {
        super(id, name, price, weight, expDate);
        this.vitamines = vitamines;
        this.carbo = carbo;
    }

    public String getVitamines() {

        return vitamines;
    }

    public double getCarbo() {
        return carbo;
    }

    public static VegetableProd createVegetableProduct(String id, String name, double price, double weight, String expDate, String vitamines, double carbo){

        return new VegetableProd(id,name,price,weight,expDate,vitamines,carbo);
    }

}
