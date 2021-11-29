import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Server{
    public static void main (String [] args){

        try{

            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            

            implsCal p1 = new implsCal(12,95);
            implsCal p2 = new implsCal(65,6);
            implsCal p3 = new implsCal(465,56);
            implsCal p4 = new implsCal(61,1);

            CalInterface stub1 = (CalInterface) UnicastRemoteObject.exportObject(p1,0);
            CalInterface stub2 = (CalInterface) UnicastRemoteObject.exportObject(p2,0);
            CalInterface stub3 = (CalInterface) UnicastRemoteObject.exportObject(p3,0);
            CalInterface stub4 = (CalInterface) UnicastRemoteObject.exportObject(p4,0);

            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9100);
            registry.rebind("b", stub1);
            registry.rebind("v", stub2);
            registry.rebind("s", stub3);
            registry.rebind("c", stub4);


        }
        catch(Exception e){System.out.println("Error is " + e);}
    }
}