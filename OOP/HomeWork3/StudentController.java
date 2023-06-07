package seminar3;

import java.util.List;

public class StudentController {

    public StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void printAll() {
        studentService.printAll();
    }

    public boolean deleteStudent(String fullName) {
        studentService.deleteStudent(fullName);
        return true;
    }

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public StudentService compareName(StudentService studentService) {
        studentService.compareServiceName(studentService.getStudentRepository());
        return studentService;
    }
    public StudentService compareSurname(StudentService studentService) {
        studentService.compareServiceSurname(studentService.getStudentRepository());
        return studentService;
    }
}