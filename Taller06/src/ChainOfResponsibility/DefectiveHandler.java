package ChainOfResponsibility;

public class DefectiveHandler extends WarrantyHandler{
    protected RequestHandler next;

    @Override
    public void setNext(RequestHandler h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void handle(Request r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isCoveredByWarranty(){
        return true;
    }
}
