public class OrderTester {
    public static void main(String[] args) {
        OrderQueue orderQueue = new OrderQueue(14);

        orderQueue.addOrder("Apples", "3/14", 5);
        orderQueue.addOrder("Butter", "6/9", 5);
        orderQueue.addOrder("Constance", "4/20", 8);

        System.out.println(orderQueue);

        orderQueue.sellOut();

        System.out.println(orderQueue);

        orderQueue.addStock(10);

        orderQueue.addOrder("Dunce", "9/99", 3);
        orderQueue.addOrder("Edgar", "1/23", 3);
        orderQueue.addOrder("Fredge", "3/10", 5);

        orderQueue.sellOut();

        System.out.println(orderQueue);
    }
}
