package Exeption_HomeWork_3;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        UserRepository r = new UserRepository();
        UserController с = new UserController(r);
        UserView v = new UserView(с);
//----------------------------------------------------
        v.InputData();
        v.Print(UserRepository.getUsers());
        v.InputData();
        v.Print(UserRepository.getUsers());
        v.InputData();
        v.Print(UserRepository.getUsers());




    }

}
