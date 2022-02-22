import java.rmi.*;
import java.rmi.server.*;

public class CalculatorServer {
    public static void main(String args[]){
        try {
            CalculatorImpl calcultorImpl = new CalculatorImpl();
            Naming.bind("add", calcultorImpl);
            Naming.bind("sub", calcultorImpl);
            Naming.bind("mul", calcultorImpl);
            Naming.bind("div", calcultorImpl);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}