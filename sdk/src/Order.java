public class Order {
    private int id;
    private float value;
    private int[] items;

    public Order(int id, float value, int[] items) {
        this.id = id;
        this.value = value;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }
}
