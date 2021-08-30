package interfaces_funcionales;

public class Main {
    public static void main(String[] args) {

        // El COMPILADOR infiere el tipo de los parametros
        // Podemos modificar el nombre de los parametros
        // Siempre que tengamos un solo parametro podemos omitir el uso de parentesis
        // Siempre que se ejecute una unica sentencia podemos omitir el uso de llaves
        ISaludar saludar = nombre -> System.out.println("Hola mundo " + nombre);
        saludar.Saluda("Hugo");
        ISaludar saludarDos = nombre -> {
            if (nombre.equals("Hugo")) {
                System.out.println("Hola Hugo, eres mi tocayo");
            } else {
                System.out.println("Hola mundo " + nombre);
            }
        };
        saludarDos.Saluda("Hugo 2");
    }
}
