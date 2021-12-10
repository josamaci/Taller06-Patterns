package ChainOfResponsibility;

public class ApprovalHandler implements RequestHandler{
    protected RequestHandler next;

    @Override
    public void setNext(RequestHandler h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void handle(Request r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean isApproved(){
        return true;
    }
}
