package taller06;

import Iterator.Computer;
import Iterator.Product;
import Strategy.AirDistribution;
import Strategy.Distributor;
import Strategy.FluvialDistribution;
import java.util.ArrayList;
import java.util.List;

public class Taller06 {

    public static void main(String[] args) {
        List<Product> p = new ArrayList<>();
        p.add(new Computer(16, false, false, true, true, "LENOVO COMPUTER", 600.95));
        p.add(new Computer(16, false, true, true, true, "HP COMPUTER", 450.75));
        p.add(new Computer(16, true, true, true, true, "DELL COMPUTER", 350.25));
        p.add(new Computer(16, false, false, true, true, "LENOVO COMPUTER", 1600.55));
        
        Distributor d = new Distributor();
        d.setStrategy(new FluvialDistribution());
        d.deliver(p);
        d.setStrategy(new AirDistribution());
        d.deliver(p);
    }
    
}
