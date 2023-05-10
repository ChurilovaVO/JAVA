package JAVA.HOMEWORK;
import java.util.Random;
import java.util.LinkedHashMap;

public class HomeWork5 {
    public static void main(String[] args) {
        String[] colors = new String [] {"синий", "красный", "голубой","черный","белый","коричневый"};
        String[] colors2 = new String [] {"СИНИЙ", "КРАСНЫЙ", "ГОЛУБОЙ","ЧЕРНЫЙ","БЕЛЫЙ","КОРИЧНЕВЫЙ"};

        LinkedHashMap <Integer,String> map1=GetMap(colors);
        System.out.println(map1);
        GetMap2(map1);
        System.out.println(map1);
        LinkedHashMap <Integer,String> map2=GetMap(colors2);
        System.out.println(map2);
        GetMap2(map2);
        System.out.println(map2);
        System.out.println();
        LinkedHashMap <Integer,String> resultMap = new LinkedHashMap<>();
        for (int key : map1.keySet()) {
            if (map2.containsKey(key)){
                resultMap.put(key, map1.get(key));
                resultMap.merge(key, map2.get(key), String::concat);
            }
        }
        System.out.println(resultMap);

    }

    public static LinkedHashMap <Integer,String> GetMap (String[] array) {
    LinkedHashMap <Integer,String> map = new LinkedHashMap<>();
        for (int index = 1; index <=6; index++) {
            while (map.size()<index){
                map.putIfAbsent(new Random().nextInt(10), array[index-1]);
            }
        }
        return map;
    }
    
    public static LinkedHashMap <Integer,String> GetMap2 (LinkedHashMap <Integer,String> m) {
        for (int key: m.keySet()) {
            m.merge(key, "!", String::concat);
        }
        return m;
        }

}
