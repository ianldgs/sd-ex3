import java.rmi.server.UnicastRemoteObject
import java.util.ArrayList

class OrderRepository : OrderManager, UnicastRemoteObject() {
    private var orders: MutableList<Order> = ArrayList()

    override fun create(value: Float, items: IntArray): Order {
        val order = Order(orders.size, value, items)

        orders.add(order)

        return order
    }

    override fun find(id: Int): Order? {
        return orders
            .first { o -> o.id == id }
    }

    override fun all(): List<Order> {
        return orders
    }

    override fun update(newOrder: Order) {
        val currentOrder = find(newOrder.id) ?: return

        currentOrder.value = newOrder.value
        currentOrder.items = newOrder.items
    }

    override fun delete(id: Int) {
        orders
            .filter { o -> o.id != id }
            .toCollection(orders)
    }
}
