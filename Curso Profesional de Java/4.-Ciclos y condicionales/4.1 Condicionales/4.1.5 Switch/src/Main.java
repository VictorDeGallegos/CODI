public class Main {
    public static void main(String[] args) {
        // Switch
        // Nos permite ejecutar varias partes de codigo vazandonos en una expresion
        String colorLuz = "Apagado";

        switch (colorLuz) {
        case "Verde":
            System.out.println("Puede continuar");

            break;
        case "Amarillo":
            System.out.println("Alto parcial");

            break;

        case "Rojo":
            System.out.println("Alto total");

            break;

        default:
            System.out.println("Semaforo averiado");
            break; // No es necesario colocar break
        }
    }
}
