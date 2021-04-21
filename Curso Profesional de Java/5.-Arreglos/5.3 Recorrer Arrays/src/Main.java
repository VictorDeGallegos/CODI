
public class Main {
    public static void main(String[] args) {
        // Arreglos

        int calificaciones[] = { 9, 8, 7, 10, 10, 9, 8, 8, 10, 9 };
        int suma = 0;
        // sum / cantidad

        for (int indice = 0; indice < calificaciones.length; indice++) {
            suma += calificaciones[indice];
        }

        float promedio = suma / calificaciones.length;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
    }
}
