package seminar3;

import lombok.*;

//@Getter
//@AllArgsConstructor
//@Setter
//@ToString
//@EqualsAndHashCode
@Data

public class Student implements Comparable <Student>  {

    private final Long id;
    private final String fullName;

    @Override
    public int compareTo(Student o) {
        return fullName.compareTo(o.fullName);
    }

    public String getSurname() {
        String[] fullName =this.fullName.split(" ");
        return fullName[1];
    }

}
