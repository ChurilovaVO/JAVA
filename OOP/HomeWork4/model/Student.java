package seminar4.model;

import lombok.*;

@Getter
//@AllArgsConstructor
//@Setter
//@ToString
@EqualsAndHashCode(callSuper = true)
//@Data
public class Student extends User implements Comparable<Student> {

    private Double gpa; //средний балл
    private String advisor; //руководитель

    public Student(Long id, String fullName, Integer age, String phoneNumber) {
        super(id);
        super.fullName=fullName;
        super.age=age;
        super.phoneNumber=phoneNumber;
    }

    @Override
    public int compareTo(Student o) {
        return getFullName().compareTo(o.getFullName());
    }

    public String toString() {
        return String.format("%s\t%s\t%s\t%s", getId(), getFullName(), getAge(), getPhoneNumber());
    }
}
