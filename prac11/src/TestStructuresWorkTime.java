import java.util.ArrayList;
import java.util.LinkedList;

public class TestStructuresWorkTime {
    public static void main(String[] args) {
        // добавление
        ArrayList<Integer> arr = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();
        long start, lastedArr, lastedList;
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            arr.add(i);
        }
        lastedArr = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            list.add(i);
        }
        lastedList = System.currentTimeMillis() - start;
        System.out.println("Array: " + lastedArr);
        System.out.println("List: " + lastedList);
        System.out.println("В добавлении " + (lastedArr > lastedList ? "быстрее List" : "быстрее Array") + '\n');

        // удаление
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            arr.remove(0);
        }
        lastedArr = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            list.remove(100000);
        }
        lastedList = System.currentTimeMillis() - start;
        System.out.println("Array: " + lastedArr);
        System.out.println("List: " + lastedList);
        System.out.println("В удалении " + (lastedArr > lastedList ? "быстрее List" : "быстрее Array") + '\n');

        // вставка
        start = System.currentTimeMillis();
        for (int i = 1; i < 10000; ++i) {
            arr.add(i * 100, 3);
        }
        lastedArr = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 1; i < 10000; ++i) {
            list.add(i * 100, 3);
        }
        lastedList = System.currentTimeMillis() - start;
        System.out.println("Array: " + lastedArr);
        System.out.println("List: " + lastedList);
        System.out.println("Во вставке " + (lastedArr > lastedList ? "быстрее List" : "быстрее Array") + '\n');

        // поиск
        start = System.currentTimeMillis();
        for (int i = 1; i < 100; ++i) {
            arr.contains(i * 1000);
        }
        lastedArr = System.currentTimeMillis() - start;
        start = System.currentTimeMillis();
        for (int i = 1; i < 100; ++i) {
            list.contains(i * 1000);
        }
        lastedList = System.currentTimeMillis() - start;
        System.out.println("Array: " + lastedArr);
        System.out.println("List: " + lastedList);
        System.out.println("В поиске " + (lastedArr > lastedList ? "быстрее List" : "быстрее Array"));
    }
}