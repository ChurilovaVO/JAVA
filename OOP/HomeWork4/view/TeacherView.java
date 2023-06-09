package seminar4.view;

import seminar4.controller.UserController;
import seminar4.model.Student;
import seminar4.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView implements UserView<Teacher> {
    UserController<Teacher> controller;

    public TeacherView(UserController<Teacher> controller) {
        this.controller = controller;
    }

    @Override
    public void sendOnConsole(String sortType) {
        List<Teacher> teachers = switch (sortType) {
            case SortType.NONE -> controller.getAll();
            case SortType.NAME -> controller.getAllSortUsers();
            case SortType.FAMILY -> controller.getAllSortUsersByFamilyName();
            case SortType.AGE -> controller.getAllSortUsersByAge();
            default -> null;
        };
        if (teachers == null) {
            System.out.println("students is null");
            return;
        }
        System.out.println("=====================");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("=====================");
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        controller.create(fullName, age, phoneNumber);
    }

    @Override
    public void removeUser(String fullName) {
        controller.removeUser(fullName);
    }

    public void changeTeacherFio(Teacher newTeacher) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите НОВОЕ ФИО:");
        String newFio = scanner.nextLine();
        newTeacher.setFullName(newFio);
        System.out.println("ФИО успешно изменены!");
        scanner.close();
    }

    public void changeTeacherAge(Teacher newTeacher) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите НОВЫЙ возраст:");
        Integer newAge = scanner.nextInt();
        newTeacher.setAge(newAge);
        System.out.println("Возраст успешно изменен!");
        scanner.close();
    }
    public void changeTeacherPhoneNumber(Teacher newTeacher) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите НОВЫЙ телефон:");
        String newPhone = scanner.nextLine();
        newTeacher.setPhoneNumber(newPhone);
        System.out.println("Телефон успешно изменен!");
        scanner.close();
    }

    public void changeTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кого будем редактировать?(введите фамилию):\n");
        String changeFullname = scanner.next();
        if (changeFullname == null) {return;}
        List<Teacher> teachers = controller.getAll();
        for (Teacher teacher : teachers) {
            if (teacher.getFullName().contains(changeFullname)) {
                Teacher newTeacher = teacher;
                System.out.println(teacher);
                System.out.println("Что будем редактировать?(введите цифру):\n" +
                        "1. ФИО\n" +
                        "2. Возраст\n" +
                        "3. Телефон\n");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    changeTeacherFio(newTeacher);
                }
                if (choice == 2) {
                    changeTeacherAge(newTeacher);
                }
                if (choice == 3) {
                    changeTeacherPhoneNumber(newTeacher);
                }

            }
        }
        scanner.close();
    }
}
