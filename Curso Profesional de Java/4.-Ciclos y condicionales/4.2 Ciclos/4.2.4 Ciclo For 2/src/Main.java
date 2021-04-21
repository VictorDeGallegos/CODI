
public class Main {
    public static void main(String[] args) {

        // Ciclo for más legible

        // for (Inicializacion; Condición; Iteracion){}

        for (int numero = 9, x = 1; x < 11;) {

            int resultado = numero * x;
            String mensaje = numero + " * " + x + " = " + resultado;

            System.out.println(mensaje);
            x++;
        }
    }

}