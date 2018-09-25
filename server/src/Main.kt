import java.rmi.RemoteException
import java.rmi.registry.LocateRegistry
import java.rmi.registry.Registry

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val manager = OrderRepository()

        try {
            val registry = LocateRegistry.getRegistry()
            registry.rebind("OrderManager", manager)
        } catch (e: RemoteException) {
            e.printStackTrace()
        }
    }
}
