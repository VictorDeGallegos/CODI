package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Book> books =  new ArrayList<>();

		//Mostrar en consola los tres titulos más vendidos.
		//Ordenar por copias.
		
		books.add(new Book("El señor de los anillos", 150));
		books.add(new Book("Don Quijote de la Mancha", 500));
		books.add(new Book("Historia de dos ciudades", 200));
		books.add(new Book("El hobbit", 100));
		books.add(new Book("El principito", 140));
		
		Comparator<Book> comparator;
		
		if( books.stream().count() > 3 )
			comparator = Comparator.comparing(book -> book.getCopies());
		else
			comparator = Comparator.comparing(book -> book.getTitle());
		
		books.stream()
			.sorted( comparator.reversed() )
			.limit(3)
			.forEach( book -> System.out.println(book.getTitle()));
	}

}
