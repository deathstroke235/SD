import java.rmi.*;
import java.rmi.server.*;

public class CalculatorClient {
    public static void main(String argsp[]) {
        try {
            String url = "rmi://localhost/";
            System.out.println("Two numbers are 45 and 7");
            CalculatorIntf calculatorIntf;
            calculatorIntf = (CalculatorIntf) Naming.lookup(url + "add");
            System.out.println("addition is " + calculatorIntf.add(45, 7));
            calculatorIntf = (CalculatorIntf) Naming.lookup(url + "sub");
            System.out.println("subtraction is " + calculatorIntf.sub(45, 7));
            calculatorIntf = (CalculatorIntf) Naming.lookup(url + "mul");
            System.out.println("multiplication is " + calculatorIntf.mul(45, 7));
            calculatorIntf = (CalculatorIntf) Naming.lookup(url + "div");
            System.out.println("division is " + calculatorIntf.div(45, 7));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}