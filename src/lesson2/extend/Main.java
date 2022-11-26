package lesson2.extend;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.greeting();


        ArrayList<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new Customer(111, "ddd","eee","ddf"));

        User user1 = users.get(0);
        User user2 = users.get(1);
        Customer cust = (Customer) user2;
        System.out.println(cust);


        User user = new Customer(111,"cffff","dgfdgffsd","dfgdfg");
        Admin admin = new Admin();

        users.add(admin);



    }
}
