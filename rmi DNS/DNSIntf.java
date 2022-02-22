import java.rmi.*;
import java.io.*;

public interface DNSIntf extends Remote {
    public String DNS(String s1) throws RemoteException;
}