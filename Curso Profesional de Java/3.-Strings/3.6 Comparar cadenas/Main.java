public class Main {
    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "hola";

        boolean resultado = cadena2.equals(cadena1);
        System.out.println(resultado);

        String nuevaCadena1 = cadena1.toUpperCase();
        String nuevaCadena2 = cadena2.toUpperCase();

        // Forma de validar que el texto sea el mismo.
        resultado = nuevaCadena1.equals(nuevaCadena2);
        System.out.println(resultado);
    }
}
