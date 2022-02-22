import java.rmi.*;
import java.rmi.server.*;
public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf{
    public AddServerImpl() throws RemoteException{}
    public double add(double a, double b) throws RemoteException{
        return a*b;
    }
}