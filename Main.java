import controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();

        // Add a new student
        controller.addStudent("ram", "sharma", "ramsharm@re.com", "123-456-7890", "123 Main St");

        // Display all students
        controller.listAllStudents();

        // Get a student by ID
        controller.showStudentById(1);
    }
}