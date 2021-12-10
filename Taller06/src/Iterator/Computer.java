
package Iterator;
//Funciona como ConcreteProduct
public class Computer extends Product{
    protected int size;
    protected boolean availableToBuy;
    protected boolean availableInStore;
    protected boolean isInRepair;
    protected boolean isDefective;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAvailableToBuy() {
        return availableToBuy;
    }

    public void setAvailableToBuy(boolean availableToBuy) {
        this.availableToBuy = availableToBuy;
    }

    public boolean isAvailableInStore() {
        return availableInStore;
    }

    public void setAvailableInStore(boolean availableInStore) {
        this.availableInStore = availableInStore;
    }

    public boolean isIsInRepair() {
        return isInRepair;
    }

    public void setIsInRepair(boolean isInRepair) {
        this.isInRepair = isInRepair;
    }

    public boolean isIsDefective() {
        return isDefective;
    }

    public void setIsDefective(boolean isDefective) {
        this.isDefective = isDefective;
    }

    public Computer(int size, boolean availableToBuy, boolean availableInStore, boolean isInRepair, boolean isDefective, String description, double price) {
        super(description, price);
        this.size = size;
        this.availableToBuy = availableToBuy;
        this.availableInStore = availableInStore;
        this.isInRepair = isInRepair;
        this.isDefective = isDefective;
    }

    public Computer() {
    }

    public Computer(String description, double price) {
        super(description, price);
    }
    
    
}
