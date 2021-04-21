public class Main {
    public static void main(String[] args) {

        // Escope
        // Determina la vida y alcance de las variables

        int promedio = 10;

        if (promedio > 7) {
            String mensaje = "Felicidades, tu promedio es de " + promedio;

            if (promedio == 10) {
                System.out.println(mensaje);
                String mensajeDos;

                if (true) {

                    mensajeDos = "De esta nueva variable";
                }
            }
        }
    }
}
