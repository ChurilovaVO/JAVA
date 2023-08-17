package JAVA.HOMEWORK;

import java.util.Arrays;

public class HomeWork_2_algo {
    public static void main(String[] args) {
        int[] myarray = new int[20];
        for (int i = 0; i < myarray.length; i++) {
            myarray[i]=(int)((Math.random()*101)-50);
        }
        System.out.println(Arrays.toString(myarray));
        sort(myarray);
        System.out.println(Arrays.toString(myarray));
    }

    public static void sort(int[] array){
        for (int i = array.length/2-1; i >=0; i--) {
            heapify(array, array.length, i);
        }
        for (int i = array.length-1; i >=0 ; i--) {
            int temp = array[0];
            array[0]=array[i];
            array[i]=temp;
            heapify(array,i,0);
        }
    }

    public static void heapify(int[] array, int heapSize, int rootIndex){
        int largest = rootIndex;
        int leftChild = 2*rootIndex+1;
        int rightChild = 2*rootIndex+2;

        if (leftChild<heapSize && array[leftChild]>array[largest])
            largest=leftChild;
        if (rightChild<heapSize && array[rightChild]>array[largest])
            largest=rightChild;
        if (largest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex]=array[largest];
            array[largest]=temp;

            heapify(array, heapSize, largest);
        }
    }

}