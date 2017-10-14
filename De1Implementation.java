import java.rmi.*;
import java.rmi.server.*;

public class De1Implementation extends UnicastRemoteObject
        implements IDe1 {

        public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public De1Implementation() throws RemoteException {
        //There is no action need in this moment.
    }
    
    @Override
    public String getGreetingMessage(String args[]) throws RemoteException {
       String s="";
        for(String arg : args )
        {
        	if(isPrimeNumber(Integer.parseInt(arg)))
        	s = s + arg +" ";
        }
        return s;
    }
}
