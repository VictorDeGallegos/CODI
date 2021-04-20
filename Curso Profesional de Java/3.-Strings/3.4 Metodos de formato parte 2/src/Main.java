public class Main {
    public static void main(String[] args) {
        String mensaje = "";
        String mensaje2 = "";
        String mensaje3 = "";
        String curso = "java";

        float valor = 10.872040f;

        // Si queremos trabajar con variables de tipo entero se usara %d si es tipo
        // flotante %f y para strings %s
        mensaje = String.format("Bienvenido al curso de %s", curso);
        mensaje2 = String.format("%.3f", valor);
        mensaje3 = String.format("El total de %d articulos es de %.4f %s", 3, valor, "MX");
        System.out.println(mensaje);
        System.out.println(mensaje2);
        System.out.println(mensaje3);
    }
}
