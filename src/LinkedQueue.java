public class LinkedQueue<T> implements Queue<T> {

    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int size = 0;

    public LinkedQueue(){
        head = null;
    }

    //O(1)
    public void enqueue(T element) {
        if (head == null){
            head = new LinkedNode<>(element);
            tail = head;
        }
        else{
            tail.next = new LinkedNode<>(element);
            tail = tail.next;
        }
        size++;
    }

    //O(1)
    public T dequeue() {
        if (head == null){
            return null;
        } else {
            LinkedNode<T> temp = head;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            size--;
            return temp.element;
        }
    }

    //O(1)
    public T peek() {
        return head.element;
    }

    //O(1)
    public int size() {
        return size;
    }

    //O(1)
    public boolean isEmpty() {
        return head == null;
    }
    
}
