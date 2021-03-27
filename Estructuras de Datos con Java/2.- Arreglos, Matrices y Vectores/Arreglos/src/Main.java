//Estructura básica de un arreglo

public class Main {

/* Secuencia de datos del mismo tipo:
 * 1,2,3,4 ...  Victor, Hugo, Gallegos
 * Trabajando con datos del mismo tipo
 * LAS DIRRECCIONES DE MEMORIA SON CONTIGUAS
 *[] usar corchetes para definir el arreglo
 */

public static void main(String[] args) {
        int arreglo[] = new int[10];
        arreglo[4] = 9; // Estamos asignando un valor a una determinada posicion
        for(int i=0; i<10; i++) {
                System.out.println(arreglo[i]);
        }
        System.out.println(arreglo.length); // longitud del arreglo que indicamos
}
}
