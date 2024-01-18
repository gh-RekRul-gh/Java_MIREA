import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayQueueModule aqm = new ArrayQueueModule();
        aqm.enqueue("Text1");
        aqm.enqueue("Text2");
        aqm.enqueue("Text3");
        aqm.enqueue("Text4");
        aqm.enqueue("Text5");
        System.out.println(aqm.size());

        aqm.dequeue();
        aqm.dequeue();
        System.out.println(aqm.size());

        for (int i = 0; i < 8; i++)
            System.out.print(aqm.dequeue() + " ");
        System.out.println();

        ArrayQueueADT adt = new ArrayQueueADT(aqm);
        System.out.println(adt.size());
        for (int i = 0; i < 3; i++)
            System.out.print(adt.dequeue() + " ");
        System.out.println(adt.size() + '\n');

        ArrayQueue aq = new ArrayQueue();
        aq.enqueue(1);
        aq.enqueue(2);
        aq.enqueue(3);
        aq.enqueue(4);
        aq.enqueue(5);
        System.out.println(aq.element());
        for (int i = 0; i < 10; i++)
            System.out.print(aq.dequeue() + " ");
        System.out.println();

        aq.clear();
        System.out.println(aq.isEmpty());
        System.out.println(aq.dequeue());
    }
}