package ChainOfResponsibility;

public interface RequestHandler {
    public void setNext(RequestHandler h);
    public void handle(Request r);
}
