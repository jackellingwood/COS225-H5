public class OrderQueue {
    private LinkedQueue<CustomerOrder> _queue;
    private int _stock;

    public OrderQueue() {
        _queue = new LinkedQueue<>();
    }

    public OrderQueue(int stock) {
        _stock = stock;
        _queue = new LinkedQueue<>();
    }

    public void addOrder(String name, String date, int quantity) {
        _queue.enqueue(new CustomerOrder(name, date, quantity));
    }

    public void addStock(int amount) {
        _stock += amount;
    }

    public void serve() {
        CustomerOrder toServe = _queue.peek();
        toServe.ship();
        _stock--;
        if (toServe.getQuantity() == 0) {
            _queue.dequeue();
        }
    }

    public void sellOut() {
        while (_stock > 0) {
            serve();
        }
    }

    public String toString() {
        return "" + _queue.peek().getQuantity();
    }
}
