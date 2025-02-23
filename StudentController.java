package controller;

import modal.Student;
import service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService studentService = new StudentService();

    public void addStudent(String firstName, String lastName, String email, String phoneNumber, String address) {
        Student student = new Student(firstName, lastName, email, phoneNumber, address);
        studentService.addStudent(student);
    }

    public void showStudentById(int studentId) {
        Student student = studentService.getStudentById(studentId);
        if (student != null) {
            System.out.println("ID: " + student.getStudentId());
            System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Phone: " + student.getPhoneNumber());
            System.out.println("Address: " + student.getAddress());
        } else {
            System.out.println("Student not found!");
        }
    }

    public void listAllStudents() {
        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student.getStudentId() + ": " + student.getFirstName() + " " + student.getLastName());
        }
    }

    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }

    public void deleteStudent(int studentId) {
        studentService.deleteStudent(studentId);
    }
}