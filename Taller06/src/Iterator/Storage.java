package Iterator;

import java.util.List;

public class Storage implements IterableCollection{
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

    @Override
    public ProductIterator createIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
