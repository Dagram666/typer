package User;

import logic.CreateUser;

public class User {
    public static void main(String[] args) {


        CreateUser user = new CreateUser("Paweł", "Dziechiaruk",
                "dagram", "wpdz2@wp.pl", "******");


        System.out.println(user.person());


    }
}