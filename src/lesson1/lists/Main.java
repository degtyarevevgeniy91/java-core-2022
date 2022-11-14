package lesson1.lists;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

/*        ArrayList <String> list = new ArrayList<>();
        list.add("dsdgsdgsdg");

        System.out.println(list);*/
        ArrayList<String> skillslist = new ArrayList<>();
        skillslist.add("java");
        skillslist.add("js");
        skillslist.add("html");
        User user = new User(1,"kokos", skillslist);

        System.out.println(user);

        user.getSkills().add("mysql");

        System.out.println(user);
    }
}
