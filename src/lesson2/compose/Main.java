package lesson2.compose;


public class Main {
    public static void main(String[] args) {

    //  CommonData commonNameSurename = new CommonData("vasya","pupkin");

//    User user = new User(1, commonNameSurename);


  //  Customer customer = new Customer(commonNameSurename, 32, "sds@qwe.email.com");


        User user = new User(1, "vasya", "pupkyn");
       CommonData commonData = user.getCommonData();


    }
}
