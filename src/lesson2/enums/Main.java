package lesson2.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        User user = new User(1, "vasya", Gender.FEMALE);
//        Gender gender = user.getGender();
//        gender.isPipka();
//        if(gender.isPipka()){
//            System.out.println("Go");
//        }
//        if (gender.equals(Gender.FEMALE)){
//            System.out.println("EEEEEE");
//        }


        Gender[] values = Gender.values();
        System.out.println(Arrays.toString(values));


    }
}
