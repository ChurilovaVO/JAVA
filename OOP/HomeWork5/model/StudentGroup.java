package seminar4.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import seminar4.service.StudentGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
@ToString
//@Data
public class StudentGroup implements Iterable<User>, Comparable<StudentGroup> {

    private final List<User> group;
    private List<Student> students;
    private Teacher teacher;
    private Long idStudentGroup;
    private String faculty;
    private Integer count;
    private boolean complete;


    public StudentGroup(Long idStudentGroup, List<User> group, String faculty,Integer countOfStudent,
                        Teacher teacher,List<Student> students) {
        this.group = group;
        this.faculty = faculty;
        this.idStudentGroup = idStudentGroup;
        this.count=countOfStudent;
        this.teacher=teacher;
        this.students=students;
    }

    @Override
    public Iterator<User> iterator() {
        return new StudentGroupIterator(group);
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t", getIdStudentGroup(), getTeacher(), getFaculty());
    }

       @Override
    public int compareTo(StudentGroup o) {
        return o.getIdStudentGroup().compareTo(getIdStudentGroup());
    }

}
