import java.util.Arrays;

public class TestStudent {
    private static void insertionSort(Student[] students) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < students.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            Student swap = students[i];
            for (j = i; j > 0 && swap.compare(students[j - 1]); j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                students[j] = students[j - 1];
            }
            students[j] = swap;
        }
    }

    public static void main(String[] args) {
        Student[] list1 = new Student[3];
        list1[0] = new Student(4, 12);
        list1[1] = new Student(1, 6);
        list1[2] = new Student(3, 7);
        Student[] list2 = new Student[3];
        list2[0] = new Student(8, 42);
        list2[1] = new Student(5, 3);
        list2[2] = new Student(6, 188);
        insertionSort(list1); // task 1
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.sortArrayByGPA(list2, 0, list2.length - 1);
        for (Student student : list1)
            System.out.println(student.toString());
        System.out.println("Now second");
        for (Student student : list2)
            System.out.println(student.toString());
        System.out.println("Now merged");
        Student[] mergedLists = mergeSort(list1, list2);
        for (Student student : mergedLists)
            System.out.println(student.toString());
    }

    private static Student[] mergeSort(Student[] students1, Student[] students2) {
        students1 = mergeSortHelper(students1);
        students2 = mergeSortHelper(students2);
        return merge(students1, students2);
    }

    private static Student[] mergeSortHelper(Student[] students) {
        int length = students.length;
        if (length <= 1) {
            return students;
        }

        int mid = length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[length - mid];

        System.arraycopy(students, 0, left, 0, mid);
        System.arraycopy(students, mid, right, 0, length - mid);

        left = mergeSortHelper(left);
        right = mergeSortHelper(right);

        return merge(left, right);
    }

    private static Student[] merge(Student[] students1, Student[] students2) {
        int length1 = students1.length;
        int length2 = students2.length;
        Student[] result = new Student[length1 + length2];

        int i = 0, j = 0, k = 0;

        while (i < length1 && j < length2) {
            if (students1[i].compare(students2[j])) {
                result[k++] = students1[i++];
            } else {
                result[k++] = students2[j++];
            }
        }

        while (i < length1) {
            result[k++] = students1[i++];
        }

        while (j < length2) {
            result[k++] = students2[j++];
        }

        return result;
    }
}
