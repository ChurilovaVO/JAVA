package HomeWork1;
import java.util.Arrays;
import java.util.Random;

public class HomeWork1_methods {

    public static void main(String[] args) {
        int i=Random();
        System.out.println(i);
        int n= highestOneBit(i);
        System.out.println(n);
        int size1=getSizeMultipleArray(i,n);
        System.out.println(Arrays.toString(getMultipleArray(size1,i,n)));
        int size2= getSizeNonMultipleArray(i,n);
        System.out.println(Arrays.toString(getNonMultipleArray(size2,i,n)));
    } 

    public static int Random() {
        int i = new Random().nextInt(2001);
        return i;
    }

    public static int highestOneBit(int args) {
    int n=Integer.highestOneBit(args);
    return n;
    }

    public static int getSizeMultipleArray(int i, int n) {
    int count=0;
    for (int j = i; j <= Short.MAX_VALUE; j++) {
        if (j%n==0) count++;
    }
    return count;
    }
    
    public static int[] getMultipleArray(int count, int i, int n) {
    int[] m1=new int[count];
    int index=0;
    for (int j = i; j <= Short.MAX_VALUE; j++) {
        if (j%n==0){
            m1[index]=j;
            index++;
        }
    }
    return m1;
    }
            
    public static int getSizeNonMultipleArray(int i, int n) {
    int count2=0;
    for (int k = Short.MIN_VALUE; k <= i; k++) {
        if (k%n!=0) count2++;
    }
    return count2;
    }

    public static int[] getNonMultipleArray(int count2, int i, int n) {
    int[] m2=new int[count2];
    int index2=0;
    for (int k = Short.MIN_VALUE; k <= i; k++) {
        if (k%n!=0){
            m2[index2]=k;
            index2++;
        }
    }
    return m2;
    }
}
    

