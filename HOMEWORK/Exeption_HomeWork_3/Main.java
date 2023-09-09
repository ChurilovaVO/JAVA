package Exeption_HomeWork_3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        UserRepository r = new UserRepository();
        UserController с = new UserController(r);
        UserView v = new UserView(с);
//----------------------------------------------------
        v.InputData();
        for (User item:UserRepository.getUsers()
             ) {
            System.out.println(item);
        }
        System.out.println(UserRepository.getUsers().size());
        v.InputData();
        for (User item:UserRepository.getUsers()
        ) {
            System.out.println(item);
        }
        System.out.println(UserRepository.getUsers().size());
        v.InputData();
        for (User item:UserRepository.getUsers()
        ) {
            System.out.println(item);
        }
        System.out.println(UserRepository.getUsers().size());




    }

}
