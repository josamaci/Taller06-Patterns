
package Strategy;

import Iterator.Product;
import java.util.List;

public class TrainDistribution implements DeliveryStrategy{

    @Override
    public void transport(List<Product> p) {
        System.out.println("Transporting products by a Train Distribution");
    }
    
}
