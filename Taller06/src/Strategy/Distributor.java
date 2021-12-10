package Strategy;

import Iterator.Product;
import java.util.List;

public class Distributor {
    protected DeliveryStrategy strategy;
    public void deliver(List<Product> p){
        strategy.transport(p);
    }
    public void setStrategy(DeliveryStrategy strategy){
        this.strategy = strategy;
    }
    
}
