package Homeworks.hw2.task3;

import lesson2.enums.Gender;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer(11,
                "Evhen",
                "Deghtyarev",
                "sadasdsa@gmail.com",
                30,
                Gender.MALE,
                Arrays.asList(
                        new Skill("fsfsf",55),
                        new Skill("dfsd",58),
                        new Skill("fesefs",78)
                ));
    }
}
