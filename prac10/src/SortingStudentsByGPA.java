import java.util.Random;

public class SortingStudentsByGPA implements Comparator<Student> {

    private int getRandomPivot(int first, int last) {
        Random random = new Random();
        return random.nextInt(last + 1 - first) + first;
    }

    public void sortArrayByGPA(Student[] students, int first, int last) {
        if (first < last) {
            int pi = partition(students, first, last);

            sortArrayByGPA(students, first, pi - 1);
            sortArrayByGPA(students, pi + 1, last);
        }
    }

    private int partition(Student[] students, int first, int last) {
        int pivotIndex = getRandomPivot(first, last);
        swap(students, pivotIndex, last);
        Student pivot = students[last];
        int i = first - 1;
        for (int j = first; j < last; ++j) {
            if (compare(students[j], pivot) <= -1) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, last);
        return i + 1;
    }

    private void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }

    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGPA() < student2.getGPA())
            return -1;
        else if (student1.getGPA() > student1.getGPA())
            return 1;
        else
            return 0;
    }
}
