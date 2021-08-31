package main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Conocer si un alumno posee por lo menos una calificacion no aprobatoria.
		// La calificación minima aprobatoria es 6.
		
		List<Integer> calificaciones = List.of(10, 10, 9, 6, 6, 7, 8, 9, 10);
		
		boolean result = calificaciones.stream()
							.anyMatch( calificacion -> calificacion < 6 );
							
		System.out.println(result);
	}

}
