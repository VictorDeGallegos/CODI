package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Obtener el cuadrado de todos los numeros en la lista.
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // 1er lista

        List<Integer> result = numeros.stream() // 2da lista
                .map(num -> num * num) // 3era lista
                .collect(Collectors.toList()); // 4ta lista
        System.out.println(numeros);
        System.out.println(result);

        // Filtrar!
        // Obtener la cantidad de usuarios con edad mayor a 18 y que el username
        // comience con R

        // List<User> users = new ArrayList<>();

        // users.add(new User("Rafael", 25));
        // users.add(new User("Daniel", 25));
        // users.add(new User("Tania", 15));
        // users.add(new User("Luisa", 24));
        // users.add(new User("Raul", 21));

        // long cantidad = users.stream().filter(user -> user.getAge() > 18)
        // .filter(user -> user.getUsername().startsWith("R")).count();
        // System.out.println(cantidad);

        // Proceso
        // Iteracion interna

        // Retornar nuevo stream
        // Retornar un valor en concreto
        // Retornar un nuevo stream
        // Stream<User> stream = users.stream();

        // Filter -> Abstraccion -Nuevo stream
        // System.out.println(stream.filter(user -> user.getAge() > 18).count());

        // List<User> newUsers = users.stream().filter(user -> user.getAge() >
        // 18).collect(Collectors.toList());
        // System.out.println(newUsers);
    }
}
