package JAVA.HOMEWORK.HomeWork4;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class HomeWork4 {
   
    public static void main(String[] args) throws IOException {
    
    // 1.????????? ? ???? ?????? ? ????????? ?? ????? ?????? ? ??????? ? ??????? 
    //????????? ?????? FileWriter ? FileReader

    FileWriter writer = new FileWriter("file1.txt", true);
    String str = "Hello world";
    writer.write(str);
    writer.append("\n");
    writer.close();
    FileReader reader = new FileReader("file1.txt");
    int c;
    while ((c=reader.read())!=-1) {
        System.out.print((char)c);
    } 
    reader.close();

    // ????????? ?? ????? ????????????? ????? ??????? ??? ??????? ? ??? ????? ???????. 
    //??????? ?? ??????? ? ??????? ? ??????? ? ??????? "?????? ?.?. 32 ?"
          
    File file = new File("C://Users/User_PC/Desktop/jawa_projects/JAVA/HOMEWORK/HomeWork4/data1.txt");
    Scanner text = new Scanner(file);
    String texString="";
    while (text.hasNextLine()){
        texString+=text.nextLine()+"\n";
    }
    text.close();
    String[] textArray=texString.split("\n");
    
    for (int i = 0; i < textArray.length; i++) {
        String[] ta=textArray[i].split(" ");
        System.out.println(ta[0]+" "+ta[1].charAt(0)+"."+ta[2].charAt(0)+"."
                             +" "+ta[3]+" "+ta[4]);
    }
    
    ArrayList <String> surname = new ArrayList<>();
    ArrayList <String> name = new ArrayList<>();
    ArrayList <String> patronymic = new ArrayList<>();
    ArrayList <Integer> age = new ArrayList<>();
    ArrayList <String> gender = new ArrayList<>();
    ArrayList <Integer> index = new ArrayList<>();

    for (int i = 0; i < textArray.length; i++) {
        String[] ta2=textArray[i].split(" ");
        surname.add(ta2[0]);
        name.add(ta2[1]);
        patronymic.add(ta2[2]);
        age.add(Integer.parseInt(ta2[3]));
        gender.add(ta2[4]);
        index.add(i);
    }
    for (Integer i : SortIndexList(age,index)) {
        System.out.println(textArray[i]);
    }
    System.out.println(age);  
    System.out.println(index);
}   

    public static ArrayList <Integer> SortIndexList(ArrayList<Integer> ageList, ArrayList<Integer> indexList) {
    int temp =0;
    ArrayList<Integer> ageListCopy = new ArrayList<>(List.copyOf(ageList));
    for (int ind=0; ind < ageListCopy.size()-1; ind++) {
       int min_age=ageListCopy.get(ind);
        for (int i = ind; i < ageListCopy.size()-1; i++) {
            if (ageListCopy.get(i+1)<min_age){
                min_age= ageListCopy.get(ind);
                ageListCopy.set(ind,ageListCopy.get(i+1));
                ageListCopy.set(i+1, min_age);

                temp= indexList.get(ind);
                indexList.set(ind,indexList.get(i+1));
                indexList.set(i+1, temp);
            }
        }
    }
        return indexList;
    }
    
    
}









