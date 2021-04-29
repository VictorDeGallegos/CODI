public class Main {
    public static void main(String[] args) {
        // For each

        int calificaciones[] = { 9, 8, 7, 10, 10, 9, 8, 8, 10, 9 };
        int suma = 0;

        // for (int i = 0; i < calificaciones.length; i++) {
        for (int calificacion : calificaciones) {

            suma += calificacion;
        }

        float promedio = suma / calificaciones.length;

        System.out.println("El promedio es: " + promedio);

    }
}
