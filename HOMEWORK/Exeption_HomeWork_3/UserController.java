package Exeption_HomeWork_3;

import javax.imageio.IIOException;
import java.io.IOException;

public class UserController {
    UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    public static void CheckInput(String data){
        try{
            UserRepository.CheckInput(data);
        }catch (IOException | NumberFormatException e){
            e.printStackTrace();
        }
    }

}
