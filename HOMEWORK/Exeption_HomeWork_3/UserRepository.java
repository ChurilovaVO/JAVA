package Exeption_HomeWork_3;

import javax.swing.text.View;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class UserRepository {
    private static HashSet<User> users;


    public UserRepository() {
        this.users = new HashSet<>();
    }

    public static HashSet<User> getUsers() {
        return users;
    }

    public static void CheckInput(String data) throws IOException, NumberFormatException {
        String[] arrayData = data.split(" ");
        if (arrayData.length == 6) {
            System.out.println("Данные введены корректно, передано на проверку соответствия формата!");
            UserRepository.CheckFormat(arrayData);
        }
        if (arrayData.length < 6) {
            throw new IOException("Введено меньше значений, чем требуется!");
        } else if (arrayData.length > 6) {
            throw new IOException("Введено больше значений,чем требуется!");
        }

    }

    public static void CheckFormat(String[] array) throws NumberFormatException, IOException {
        String suname = null;
        String name = null;
        String patronymic = null;
        String birthday = null;
        long phoneNumber = 0;
        char gender = '0';
        ArrayList<String> fio = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("^\\d{11}$")) {
                phoneNumber = Long.parseLong(array[i]);
                fio.remove(array[i]);
            }
            if (array[i].matches("^\\d{2}.\\d{2}.\\d{4}$")) {
                birthday = array[i];
                CheckBirthday(birthday);
                fio.remove(array[i]);
            }
            if (array[i].equals("m") || array[i].equals("f")) {
                gender = array[i].charAt(0);
                fio.remove(array[i]);
            }
        }
        suname = fio.get(0);
        name = fio.get(1);
        patronymic = fio.get(2);

        if (phoneNumber == 0) {
            throw new NumberFormatException("Номер телефона введен некорректно!");
        }
        if (gender != 'm' && gender != 'f') {
            throw new NumberFormatException("Пол введен некорректно!");
        }
        System.out.println("Формат соответствует требуемому, пользователь отправлен на сохранение!");
        CreateUser(suname, name, patronymic, birthday, phoneNumber, gender);
    }

    public static void CreateUser(String suname, String name, String patronymic,
                                  String birthday, long phoneNumber, char gender) throws IOException {

        User newUser = new User(suname, name, patronymic, birthday, phoneNumber, gender);
        if (!UserRepository.users.contains(newUser)) {
            UserRepository.users.add(newUser);
            SaveUser(newUser);
        } else throw new IOException("Данный пользователь уже существует!!");

    }


    private static boolean CheckBirthday(String birthday) throws NumberFormatException { //проверка даты рождения
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        String[] birthdayArray = birthday.split("\\.");
        int[] birthdayArrayInt = new int[3];
        for (int i = 0; i < birthdayArray.length; i++) {
            birthdayArrayInt[i] = Integer.parseInt(birthdayArray[i]);
        }
        if (birthdayArrayInt[0] <= 31 && birthdayArrayInt[1] <= 12 && birthdayArrayInt[2] <= year) {
            return true;
        } else {
            throw new NumberFormatException("Введенная дата рождения некорректна!");
        }

    }

    public static void SaveUser(User user) {
        try (FileWriter writer = new FileWriter(user.getSuname(), true)) {
            writer.write("<" + user.getSuname() + ">" +
                    "<" + user.getName() + ">" +
                    "<" + user.getPatronymic() + ">" +
                    "<" + user.getBirthdate() + ">" +
                    "<" + user.getPhoneNumber() + ">" +
                    "<" + user.getGender() + ">");
            writer.write("\r\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Пользователь успешно сохранен!");
    }


}


