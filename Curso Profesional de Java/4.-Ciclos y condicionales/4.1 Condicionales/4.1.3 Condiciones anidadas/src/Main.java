
public class Main {
    public static void main(String[] args) {

        // El promedio minimo para aprobar es de 7.
        // Si el promedio es 10 = Muchas felicidades.
        // Si el promedio es aprobatorio pero menor a 10 = Felicidades.
        // Si el promedio no es aprobatorio es necesario repasar.

        int promedio = 7;

        if (promedio >= 7) {

            // El promedio es aprobatorio

            if (promedio == 10) {

                System.out.println("Muchas Felicidades");

            } else {

                System.out.println("Felicidades");
                // El promedio no es aprobatorio
            }

        } else {

            System.out.println("Necesitas repasar");

        }

    }
}
