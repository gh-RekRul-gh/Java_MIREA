import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static <T> T getMemberOfArray(T[] array, int i) {
        if (array.length > i && i >= 0)
            return array[i];
        return null;
    }

    public static <T> List<T> convertToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list1 = convertToList(numbers);

        String[] strings = new String[]{"Why", "I", "Did", "This"};
        List<String> list2 = convertToList(strings);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println(getMemberOfArray(numbers, 3));
        System.out.println(getMemberOfArray(strings, 0));
    }
}