import java.util.Date;

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
        this.addDate = new Date();

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


}