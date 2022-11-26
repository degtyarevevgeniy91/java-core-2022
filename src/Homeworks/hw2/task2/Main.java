package Homeworks.hw2.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC(
                new Monitor("MF2","Samsung",24),
                new Cpu("i5",Producer.INTEL,2800),
                new Ram(Type.DDR4,"efefs",8));

        Laptop laptop = new Laptop(
                new Monitor("MF5", "ASUS", 17),
                new Cpu("i3", Producer.INTEL, 2400),
                new Ram(Type.DDR3, "dgfdfgrf", 8),
                new Touchpad("fsdfsdf", "fweffsd"));

        Ultrabook ultrabook = new Ultrabook(
                new Monitor("MF5", "ASUS", 17),
                new Cpu("i3", Producer.INTEL, 2400),
                new Ram(Type.DDR3, "dgfdfgrf", 8),
                new Touchpad("fsdfsdf", "fweffsd"),
                0.8
        );

//        ArrayList<PC> list = new ArrayList<>(){
//            {
//                this.add(laptop);
//                this.add(pc);
//                this.add(ultrabook);
//            }};
//        System.out.println(list);


        List<PC> list = Arrays.asList(pc,laptop,ultrabook);
        List<String> asd = new ArrayList<>();
        System.out.println(list);
    }






}
