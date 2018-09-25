import java.rmi.NotBoundException
import java.rmi.RemoteException
import java.rmi.registry.LocateRegistry

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        try {
            val registry = LocateRegistry.getRegistry("127.0.0.1")
            val manager = registry.lookup("OrderManager") as OrderManager

            val order = manager.create(123f, intArrayOf(1, 2, 3))

            print("Order: ${order.id}")

            order.value = 321f

            manager.update(order)

            print(manager.all())

            manager.delete(order.id)

            print(manager.all())

        } catch (e: RemoteException) {
            e.printStackTrace()
        } catch (e: NotBoundException) {
            e.printStackTrace()
        }
    }
}
