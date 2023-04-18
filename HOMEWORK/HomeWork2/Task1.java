package JAVA.HOMEWORK.HomeWork2;

import java.lang.Math;

public class Task1 {
    
    public static void main(String[] args) {
        String str1 = "Основание -5, степень 3, результат равен";
        String str2 = "Основание 127, степень 2, результат равен";
        String str3 = "Основание 33, степень 15, результат равен";
        String str4 = "Основание 4, степень 7, результат равен";
        Exponentiation(str1);
        Exponentiation(str2);
        Exponentiation(str3);
        Exponentiation(str4);
    }

    public static void Exponentiation(String str) {
        str = str.replace(",","");
        String[] str_list=str.split(" ");
        int x = Integer.parseInt((str_list[1]));
        int y = Integer.parseInt((str_list[3]));
        double xD = x;
        double yD = y;
        Double result = Math.pow(xD, yD);
        long resultLong=result.longValue();
        System.out.println(str+" " + resultLong);
    }
}