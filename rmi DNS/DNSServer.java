import java.rmi.*;
import java.rmi.server.*;

public class DNSServer {
    public static void main(String args[]) throws RemoteException {
        try {
            DNSImpl dnsServerImpl = new DNSImpl();
            Naming.rebind("DNSServer", dnsServerImpl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}