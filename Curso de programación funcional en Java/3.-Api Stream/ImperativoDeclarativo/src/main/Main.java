package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// Obtener la cantidad de usuarios con una edad mayor a 18 y que su username comience con R.
		
		List<User> users = new ArrayList<>();
		
		users.add(new User("Rafael", 25));
		users.add(new User("Daniel", 20));
		users.add(new User("Tania", 15));
		users.add(new User("Luisa", 24));
		users.add(new User("Raul", 21));
		
		//Proceso
		//Iteración interna
		
		//Retornan un nuevo stream
		//Retornan un valor en concreto
		
		Stream<User> stream = users.stream();
		
		//Filter -> Abstracción -> Nuevo Stream
		System.out.println( stream.filter(user -> user.getAge() > 18).count() );
		
	}		
}
