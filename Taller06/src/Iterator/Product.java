package Iterator;

public abstract class Product {
    protected String description;
    protected double price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public Product() {
    }
    
    
}
