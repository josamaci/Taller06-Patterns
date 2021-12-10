package ChainOfResponsibility;

public class ReplacementHandler extends DefectiveHandler{
    protected RequestHandler next;

    @Override
    public void setNext(RequestHandler h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void handle(Request r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isThereAReplacement(){
        return true;
    }
}
