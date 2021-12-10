package Iterator;

import java.util.List;

public class Storage {
    protected List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Storage() {
    }

    public Storage(List<Product> products) {
        this.products = products;
    }
    
    
}
