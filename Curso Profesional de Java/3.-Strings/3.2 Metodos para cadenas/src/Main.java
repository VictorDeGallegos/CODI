public class Main {
    public static void main(String[] args) {

        String mensaje = " Hola soy un String";

        int cantidad = mensaje.length(); // Devuelve el numero de caracteres de un String contemplando los espacios _

        boolean contiene = mensaje.contains("Hola");// El string a buscar debe ser exactamente igual si se desea tener
                                                    // true

        boolean comienzaCon = mensaje.startsWith("hola");
        boolean terminaCon = mensaje.endsWith("String");

        System.out.println(cantidad);
        System.out.println(contiene);

        System.out.println(comienzaCon);
        System.out.println(terminaCon);

        String nuevoString = mensaje.concat(" Y estamos en el curso de java");

        System.out.println(nuevoString);
    }
}
