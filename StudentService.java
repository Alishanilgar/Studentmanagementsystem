package service;

import Dao.StudentDao;
import modal.Student;

import java.util.List;

public class StudentService {

    private StudentDao studentDAO = new StudentDao();

    // Add student
    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    // Get student by ID
    public Student getStudentById(int studentId) {
        return studentDAO.getStudentById(studentId);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    // Update student
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    // Delete student
    public void deleteStudent(int studentId) {
        studentDAO.deleteStudent(studentId);
    }
}