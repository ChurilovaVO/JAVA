package seminar3;

import lombok.Getter;

import java.util.ArrayList;

@Getter

public class StudentRepository {
    private final StudentGroup studentGroup;


    public StudentRepository(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.addStudent(student);
    }

}
