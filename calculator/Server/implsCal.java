import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class implsCal implements CalInterface{
    public int x;
    public int y;

    public implsCal(int xx, int yy){
        this.x = xx;
        this.y =yy;
    }

    public int add() throws RemoteException{
        return this.x+this.y;
    }

    public int sub() throws RemoteException{
        return this.x-this.y;
    }

    public int mul() throws RemoteException{
        return this.x*this.y;
    }

    public float div() throws RemoteException{
        return this.x/this.y;
    }
}