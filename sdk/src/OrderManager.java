import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface OrderManager extends Remote {
    Order create(float value, int[] items) throws RemoteException;

    Order find(int id) throws RemoteException;

    List<Order> all() throws RemoteException;

    void update(Order order) throws RemoteException;

    void delete(int id) throws RemoteException;
}
