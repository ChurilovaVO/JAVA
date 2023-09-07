package Exeption_HomeWork_2;
//Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.io.IOException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(inputFloatNumber());
    }

    private static Float inputFloatNumber() {
        boolean check = false;
        Float fNum = null;
        while (check == false) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Введите дробное число типа 'float' (через запятую): ");
            check = iScanner.hasNextFloat();
            try{
                fNum = iScanner.nextFloat();
                iScanner.close();
            }catch (Exception e){
                System.out.println("Ошибка ввода!Попробуйте еще раз!");
            }
        }
        return fNum;
    }
}
