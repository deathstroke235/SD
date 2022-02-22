import java.rmi.*;
import java.rmi.server.*;

public interface AddServerIntf extends Remote{
    double add(double a, double b) throws RemoteException;
}