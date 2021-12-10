
package Strategy;

import Iterator.Product;
import java.util.List;

public class LandDistribution implements DeliveryStrategy{

    @Override
    public void transport(List<Product> p) {
        System.out.println("Transporting products by a Land Distribution");
    }
    
}
