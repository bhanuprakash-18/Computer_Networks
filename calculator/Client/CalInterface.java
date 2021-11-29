import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalInterface extends Remote {
    public int add() throws RemoteException;
    public int sub() throws RemoteException;
    public int mul() throws RemoteException;
    public float div() throws RemoteException;
}