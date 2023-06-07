package seminar3;

import lombok.Getter;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
@Getter
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void printAll() {
        for (Student student : studentRepository.getStudentGroup()) {
            System.out.println(student);
        }
    }

    public void deleteStudent(String fullName) {
        Iterator<Student> iterator = studentRepository.getStudentGroup().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equals(fullName)) {
                iterator.remove();
            }
        }
    }

    public StudentRepository compareServiceName(StudentRepository studentRepository) {
        studentRepository.getStudentGroup().getStudentsList().sort(Student::compareTo);
        return studentRepository;
    }

    public StudentRepository compareServiceSurname(StudentRepository studentRepository) {
        studentRepository.getStudentGroup().getStudentsList().sort(new StudentComparator());
        return studentRepository;
    }



}
