import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Client{
    public static void main(String [] args){
        try{
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);

            CalInterface bha = (CalInterface) registry.lookup("b");
            int z;
            z = bha.add();
            System.out.println("The sum is " + z);
        }
        catch(Exception e){System.out.println("Error is" + e);}
    }
}