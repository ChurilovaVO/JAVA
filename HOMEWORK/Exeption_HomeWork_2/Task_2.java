package Exeption_HomeWork_2;

//Задание 2. Если необходимо, исправьте данный код (задание 2
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

public class Task_2 {
    public static void main(String[] args) {
        // 1 вариант
        try {
            int d = 0;
            int[] intArray={54,59,6,36,5,254,25,231,69,85};
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            e.printStackTrace();
        }

        // 2 варинат
        int d = 0;
        int[] intArray={54,59,6,36,5,254,25,231,69,85};
        double catchedRes1 = (double)intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);

    }




}
