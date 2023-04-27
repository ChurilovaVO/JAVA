package JAVA.HOMEWORK.HomeWork3;
//import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.ListIterator;


public class HomeWork3 {
    public static void main(String[] args) {
        //1. Реализовать алгоритм обратной сортировки списков компаратором.
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++) {list.add(new Random().nextInt(25));}
        System.out.println(list);
        
        ArrayList <Integer> list1 = new ArrayList<>(list);
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);

        //2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        for (int i = 0; i <list1.size(); i++) {
            if (list1.get(i)%2==0){
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);

        //3. Задан целочисленный список ArrayList. Найти минимальное, максимальное 
        //и среднее из этого списка.
        list.sort(Comparator.reverseOrder());
        int max =list.get(0);
        int min= list.get(list.size()-1);
        System.out.println("Max="+max+", "+"Min="+min);
        double sum=0;               
        for (int i = 0; i < list.size(); i++) {
            sum+=list.get(i);
        }
        Double middle =sum/list.size();
        System.out.println("Среднее="+middle);
        System.out.println();

        //4. Дано два целочисленных списка, объеденить их не допуская элементы 
        //второго списка уже встречающиеся в первом.

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i=0;i<10;i++) {
            list2.add(new Random().nextInt(25));
            list3.add(new Random().nextInt(25));
        }
        System.out.println(list2);
        System.out.println(list3);
        list3.removeAll(list2);
        list2.addAll(list3);
        System.out.println(list2);
        System.out.println();

        //.Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
        ArrayList<Integer> arrayList = new ArrayList<>();
        long start1=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, 0);
        }
        System.out.println(arrayList);
        long end1=System.currentTimeMillis();
        System.out.println(end1-start1);
        System.out.println();

        //.Повторить пятый пункт но с LinkedList
        LinkedList <Integer> linkedList = new LinkedList<>();
        long start2=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, 0);
        }
        System.out.println(linkedList);
        long end2=System.currentTimeMillis();
        System.out.println(end2-start2);
    }
}
