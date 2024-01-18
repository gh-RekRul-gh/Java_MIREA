public class Student implements Comparable<Student> {
    private final int idNumber;
    private final int GPA;

    @Override
    public boolean compare(Student otherStudent) {
        return this.idNumber < otherStudent.idNumber;
    }

    public Student(int idNumber, int finalScore) {
        this.idNumber = idNumber;
        this.GPA = finalScore;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String toString() {
        return "This student's id is " + this.getIdNumber() + " and his GPA is " + this.getGPA();
    }

    public int getGPA() {
        return GPA;
    }
}
