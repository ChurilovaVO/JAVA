package Exeption_HomeWork_2;

import java.util.Scanner;

// Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

//!!!не стала додумывать до повторного запроса в случае ввода пустой строки, вроде в условиях это не требуется???
public class Task_4 {
    public static void main(String[] args) {
        String name = InputString();
        while (name.isEmpty()) {
            System.out.println("Пустую строку вводить нельзя!");
            throw new NullPointerException();
        }
        System.out.println(name);
        System.out.println("Данные введены верно!");
    }
    public static String InputString() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String name = iScanner.nextLine();
        iScanner.close();
        return name;
    }
}
