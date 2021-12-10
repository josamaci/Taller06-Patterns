package Iterator;

public class DefectivePI implements ProductIterator{
    protected Storage collection;
    protected Product iterationState;

    public DefectivePI(Storage collection) {
        this.collection = collection;
        this.iterationState = null;
    }
    
    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
