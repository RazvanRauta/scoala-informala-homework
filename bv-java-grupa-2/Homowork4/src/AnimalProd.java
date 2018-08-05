import java.util.Objects;

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

        return new AnimalProd(id, name, price, weight, expDate, stoTemp);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AnimalProd)) return false;
        AnimalProd that = (AnimalProd) o;
        return Double.compare(that.stoTemp, stoTemp) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(stoTemp);
    }
}
