import java.rmi.*;
import java.rmi.server.*;

public class DNSClient {
    public static void main(String args[]) throws RemoteException {
        try {
            String dnsServerUrl = "rmi://" + args[0] + "/DNSServer";
            DNSIntf dnsServerIntf = (DNSIntf) Naming.lookup(dnsServerUrl);
            System.out.println("Website name is :" + args[1]);
            String s = args[1];
            System.out.println(s + " IP Address : " + dnsServerIntf.DNS(s));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}