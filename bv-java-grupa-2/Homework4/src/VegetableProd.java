import java.util.Objects;

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

    public static VegetableProd createVegetableProduct(String id, String name, double price, double weight, String expDate, String vitamines, double carbo) {

        return new VegetableProd(id, name, price, weight, expDate, vitamines, carbo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VegetableProd)) return false;
        VegetableProd that = (VegetableProd) o;
        return Double.compare(that.carbo, carbo) == 0 &&
                Objects.equals(vitamines, that.vitamines);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vitamines, carbo);
    }
}
