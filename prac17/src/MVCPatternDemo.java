public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        System.out.println("Before update:");
        controller.updateView();
        System.out.println();

        controller.setStudentName("Alex");
        controller.setStudentRollNo("2");
        System.out.println("After update:");
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Ruslan");
        student.setRollNo("1");
        return student;
    }
}