import java.rmi.*;

public interface IDe1 extends Remote
{
    public String getGreetingMessage(String args []) throws RemoteException;
}