package org.example;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1. Реализуйте метод, принимающий в качестве аргументов двумерный массив.
        // Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
        // детализировать какие строки со столбцами не требуется.

        int[][] ints1 = new int[3][];
        ints1[0] = new int[]{0, 1, 0};
        ints1[1] = new int[]{1, 2, 1};
        ints1[2] = new int[]{0, 1, 0};

        int[][] ints2 = {{0, 1, 1, 2, 4, 6},
                {1, 2, 1, 2,},
                {0, 1, 0, 2},
                {0, 1, 2},
                {0,},
                {9}
        };


        int[][] ints3 = null;

        int[][] ints4 = {{2, 4, 6},
                {1, 2,},
                {0, 1, 0, 2},
                {0, 1, 2},
        };

        System.out.println("ints1:" + checkArrayIndexLength(ints1));
        System.out.println("ints2:" + checkArrayIndexLength(ints2));
        System.out.println("ints3:" + checkArrayIndexLength(ints3));
        System.out.println("ints4:" + checkArrayIndexLength(ints4));


    }

    public static boolean checkArrayIndexLength(int[][] arr) {
        try {
            if (arr == null) {
                throw new NullPointerException("Array is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        int column_length = 0;
        for (int i = 0; i < arr.length; i++) {
            column_length = colColumn(arr, i);
            if (arr[i].length != column_length) {
                return false;
            }
        }
        return true;
    }

    public static int colColumn(int[][] ar, int indexColumn) {
        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (j == indexColumn) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }


}