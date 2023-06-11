package seminar4.model;

import lombok.*;

@Getter
//@AllArgsConstructor
@Setter
//@ToString
@EqualsAndHashCode(callSuper = true)
//@Data
public class Student extends User implements Comparable<Student> {

    private Double gpa; //средний балл
    private String advisor; //руководитель
    public boolean distribution;

    public Student(Long id, String fullName, Integer age, String phoneNumber, String status) {
        super(id);
        super.status=status;
        super.fullName=fullName;
        super.age=age;
        super.phoneNumber=phoneNumber;
        this.distribution=false;
    }

    @Override
    public int compareTo(Student o) {
        return getFullName().compareTo(o.getFullName());
    }

    public String toString() {
        return String.format("%s\t%s\t%s\t%s\t%s,\t%s", getId(), getFullName(), getAge(), getPhoneNumber(),
                isDistribution(),getStatus());
    }
}
