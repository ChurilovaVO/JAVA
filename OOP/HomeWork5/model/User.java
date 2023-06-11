package seminar4.model;

import lombok.Data;
import lombok.Setter;

@Data
@Setter

public class User {
    private final Long id;
    protected String fullName;
    protected Integer age;
    protected String phoneNumber;
    protected String status;

}
