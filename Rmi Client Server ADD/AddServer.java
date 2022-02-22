import java.rmi.*;
import java.rmi.server.*;
public class AddServer{
    public static void main(String args[]) {
        try {
            AddServerImpl addServerImpl = new AddServerImpl();
            Naming.rebind("AddServer", addServerImpl);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}