package JAVA.HOMEWORK;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.TreeMap;


public class HomeWork6 {
    public static void main(String[] args) {
        myHashSet myHSet = new myHashSet();
        myHSet.add(8);
        for (int i = 0; i < 5; i++) {
            myHSet.add(new Random().nextInt(15));
        }
        System.out.println(myHSet.toString());
        System.out.println(myHSet.getItem(3));

        //*Методы из семинара
        System.out.println(myHSet.contains(7));
        myTreeSet myTSet = new myTreeSet();
        for (int i = 0; i < 5; i++) {
            myTSet.add(new Random().nextInt(15));
        }
        System.out.println(myTSet.toString());


    }

}

class myHashSet{
    static final Object OBJECT = new Object();
    private LinkedHashMap<Integer, Object> lHashMap = new LinkedHashMap<>();

    public boolean add(int num){
        return lHashMap.put(num, OBJECT) == null;
    }
    public String toString() {
        return lHashMap.keySet().toString();
    }
    public Object[] toArray() {
        return lHashMap.keySet().toArray();
    }
    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }
    public boolean contains(int num) {
        return lHashMap.containsKey(num);
    }

}

class myTreeSet{
    static final Object OBJECT = new Object();
    private TreeMap <Integer,Object> mTreeMap = new TreeMap<>();
    public boolean add(int num){
        return mTreeMap.put(num, OBJECT) == null;
    }
    public String toString() {
        return mTreeMap.keySet().toString();
    }
    public Object[] toArray() {
        return mTreeMap.keySet().toArray();
    }
    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }
    public boolean contains(int num) {
        return mTreeMap.containsKey(num);
    }

}