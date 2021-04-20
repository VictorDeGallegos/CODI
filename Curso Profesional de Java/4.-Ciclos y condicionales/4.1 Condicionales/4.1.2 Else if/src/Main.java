public class Main {
    public static void main(String[] args) {
        // Condiones
        // else if

        String colorLuz = "Apagado";

        if (colorLuz.equals("Verde")) {

            System.out.println("Puede continuar");

        } else if (colorLuz.equals("Amarillo")) {

            System.out.println("Alto parcial");

        } else if (colorLuz.equals("Rojo")) {

            System.out.println("Alto total");

        } else {

            System.out.println("Semaforo averiado");
        }

    }
}
