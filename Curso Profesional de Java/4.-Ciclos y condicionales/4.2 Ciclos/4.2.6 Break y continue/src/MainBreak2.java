public class MainBreak2 {
    public static void main(String[] args) {

        // Clase mas robusta para representar
        // Break and Continue

        for (int i = 0; i < 3; i++) {
            System.out.print("Siguiente " + i + " : ");

            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break;
                }

                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.print("Ciclo completado!");
    }
}
