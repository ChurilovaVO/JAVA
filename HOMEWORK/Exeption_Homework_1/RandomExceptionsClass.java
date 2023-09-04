package org.example;

//2. Дан класс
// https://github.com/sabinaIsm/test/blob/d2ebf811b85139783b1a0dcbe3714dbb28deee82/RandomExceptionsClass.java
//Запустите код, с помощью анализа стектрейса найдите и по возможности исправьте ошибки,
// добейтесь корректного выполнения программы.

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class RandomExceptionsClass {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        ArrayList<String> stringArraysList = null;
        try {
            stringArraysList = (ArrayList<String>) callMethod1();
        } catch (Exception e) {
            System.out.println("Exeption:" + e.getClass().getSimpleName());
        }
        int a = 10, b = 0;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        //callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10 - 10);
        return new LinkedList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("1.txt");
            fis.read();
        } catch (Exception e) {
            System.out.println("Exeption:" + e.getClass().getSimpleName());
        }
        try {
            if (fis.available() > 0)
                throw new RuntimeException();
        } catch (NullPointerException e) {
            System.out.println("Exeption:" + e.getClass().getSimpleName());
        }
        int num = callMethod4("124O");
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exeption:" + e.getClass().getSimpleName());
        }
        return result;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        int result = 0;
        try {
            result = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Exeption:" + e.getClass().getSimpleName());
        }
        return result;
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        try {
            for (int i = 1; i <= strings.length; i++) {
                strings[i] = s;
            }
        } catch (RuntimeException e) {
            System.out.println("Exeption:" + e.getClass().getSimpleName());
        }


    }
}