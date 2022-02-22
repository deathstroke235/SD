import java.rmi.*;
import java.rmi.server.*;

public class DNSImpl extends UnicastRemoteObject implements DNSIntf {
    public DNSImpl() throws RemoteException {
    }

    public String DNS(String s1) throws RemoteException {
        if (s1.equals("osmania")) {
            System.out.println("Osmania Site: ");
            return "1.1.1.0";
        } else {
            return "No Data";
        }
    }
}
