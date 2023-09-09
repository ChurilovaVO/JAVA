package Exeption_HomeWork_3;

public class User {
    private String suname;
    private String name;
    private String patronymic;
    private String birthdate;
    private long phoneNumber;
    private char gender;

    public User(String suname, String name, String patronymic, String birthdate, long phoneNumber, char gender) {
        this.suname = suname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getSuname() {
        return suname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return String.format("%s\t%s\t%s\t%s\t%s,\t%s", getSuname(), getName(), getPatronymic(), getBirthdate(),
                getPhoneNumber(),getGender());
    }
}
