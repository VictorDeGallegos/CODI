package main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Obtener el cuadrado de todos los números en la lista.
		
		List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10); 
		
		numeros.stream() 
				.forEach(num -> {
					
					int resultado = num * num;
					System.out.println(resultado); 
				});
		
	}		
}
