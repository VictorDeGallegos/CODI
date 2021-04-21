public class MainBreak {
    public static void main(String[] args) {

        // Break and Continue

        int valor = 10;

        switch (valor) {
        case 10:
            System.out.println("Es 10");
            break;

        default:
            System.out.println("No es 10");
        }

        for (int x = 1; x < 101; x++) {
            if (x == 50) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("Ciclo completado!");
    }
}
