import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private double price;
    private double weight;
    private String expDate;
    private Date addDate;

    public Product(String id, String name, double price, double weight, String expDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.expDate = expDate;
        this.addDate = setAddDate();

    }

    public Date setAddDate() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dt = sf.parse(sf.format(new Date()));
            return dt;
        } catch (ParseException e) {
            return null;
        }
    }

    public double getPrice() {

        return price;

    }

    public String getExpDate() {
        return expDate;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Date getAddDate() {
        return addDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Double.compare(product.weight, weight) == 0 &&
                Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(expDate, product.expDate) &&
                Objects.equals(addDate, product.addDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, price, weight, expDate, addDate);
    }
}
