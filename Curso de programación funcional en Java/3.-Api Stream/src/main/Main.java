package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Filtrar!
        // Obtener la cantidad de usuarios con edad mayor a 18 y que el username
        // comience con R

        List<User> users = new ArrayList<>();

        users.add(new User("Rafael", 25));
        users.add(new User("Daniel", 25));
        users.add(new User("Tania", 15));
        users.add(new User("Luisa", 24));
        users.add(new User("Raul", 21));

        long cantidad = users.stream().filter(user -> user.getAge() > 18)
                .filter(user -> user.getUsername().startsWith("R")).count();
        System.out.println(cantidad);
    }
}
