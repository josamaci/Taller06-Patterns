
package Strategy;

import Iterator.Product;
import java.util.List;

public interface DeliveryStrategy {
    void transport(List<Product> p);
}
