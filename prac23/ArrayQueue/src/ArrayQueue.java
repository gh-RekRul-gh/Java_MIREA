
public class ArrayQueue {
    private final ArrayQueueModule queue;

    public ArrayQueue() {
        this.queue = new ArrayQueueModule();
    }


    public Object dequeue() {
        return queue.dequeue();
    }


    public Object element() {
        return queue.element();
    }


    public void enqueue(Object o) {
        queue.enqueue(o);
    }


    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
    public void clear() {
        queue.clear();
    }
}