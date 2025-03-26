public class LinkedQueue<T> implements Queue<T> {

    private LinkedNode<T> head;
    private LinkedNode<T> tail;
    private int size = 0;

    public LinkedQueue(){
        head = null;
    }

    //O(1) - uh oh
    public void enqueue(T element) {
        if (head == null){
            head = new LinkedNode<T>(element);
            tail = head;
        }
        else{
            LinkedNode<T> temp = tail;
            temp.next = new LinkedNode<T>(element);
            tail = temp;
        }
        size++;
    }

    //O(1)
    public T dequeue() {
        if (head == null){
            return null;
        }
        else{
            LinkedNode<T> temp = head;
            head = head.next;
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
