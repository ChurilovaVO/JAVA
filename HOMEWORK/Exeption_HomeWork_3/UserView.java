package Exeption_HomeWork_3;

import java.util.Scanner;

public class UserView {
    private static Scanner iScanner;
    UserController controller;

    public UserView(UserController controller) {
        iScanner = new Scanner(System.in);
        this.controller = controller;
    }



    public static void InputData() {
        System.out.println("Введите через пробел:" +
                " Фамилия Имя Отчество датарождения(dd.mm.yyyy) номертелефона(без знаков) пол(f/m): ");
        String name = iScanner.nextLine();
        //iScanner.close();
        UserController.CheckInput(name);

    }

    public void Print() {

    }

}
