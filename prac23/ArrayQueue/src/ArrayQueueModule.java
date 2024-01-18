
public class ArrayQueueModule {
    private static final int START_CAPACITY = 16;
    private Object[] q;
    private int head = 0;
    private int tail = 0;

    public ArrayQueueModule() {
        q = new Object[START_CAPACITY];
    }

    public Object dequeue() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        Object r = q[head++];
        if (head == tail) head = 0;
        return r;
    }

    public boolean isEmpty() {
        return (head == tail && head == 0);
    }

    public void enqueue(Object element) {
        q[tail++] = element;
        if (tail == q.length) resize(q.length * 2);
    }

    // Pre: none;
    // Post: q.length == nSize;
    //       queue - immutable;
    private void resize(int nSize) {
        Object[] nq = new Object[nSize];
        System.arraycopy(q, 0, nq, 0, q.length);
        q = nq;
    }


    public Object element() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return q[head];
    }

    public int size() {
        return tail;
    }

    public void clear() {
        head = tail = 0;
        q = new Object[START_CAPACITY];
    }
}