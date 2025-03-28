public class CustomerOrder {
    private String _name;
    private String _date;
    private int _quantity;

    public CustomerOrder() {}

    public CustomerOrder(String name, String date, int quantity) {
        _name = name;
        _date = date;
        _quantity = quantity;
    }

    public String getName() {
        return _name;
    }

    public String getDate() {
        return _date;
    }

    public int getQuantity() {
        return _quantity;
    }

    public void ship() {
        if (_quantity > 0) {
            _quantity--;
        }
    }
}