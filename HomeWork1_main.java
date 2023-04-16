package HomeWork1;
import java.util.Arrays;
import java.util.Random;

public class HomeWork1_main {
    public static void main(String[] args) {
    // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    int i = new Random().nextInt(2001);
    System.out.println(i);
    
    // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    int n=Integer.highestOneBit(i);
    System.out.println(n);

    // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в 
    // массив m1
    int count=0;
    for (int j = i; j <= Short.MAX_VALUE; j++) {
        if (j%n==0) count++;
    }
    int[] m1=new int[count];
    int index=0;
    for (int j = i; j <= Short.MAX_VALUE; j++) {
        if (j%n==0){
            m1[index]=j;
            index++;
        }
    }
    System.out.println(Arrays.toString(m1));
    
    // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить 
    // в массив m2
    int count2=0;
    for (int k = Short.MIN_VALUE; k <= i; k++) {
        if (k%n!=0) count2++;
    }
    int[] m2=new int[count2];
    int index2=0;
    for (int k = Short.MIN_VALUE; k <= i; k++) {
        if (k%n!=0){
            m2[index2]=k;
            index2++;
        }
    }
    System.out.println(Arrays.toString(m2));
    }
}
