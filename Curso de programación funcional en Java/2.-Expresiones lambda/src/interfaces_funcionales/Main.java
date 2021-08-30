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

        ISuma suma = (val1, val2) -> val1 + val2;
        int resultado = suma.suma(10, 20);
        System.out.println(resultado);

        // DE OTRA FORMA
        suma = (val1, val2) -> {
            int result = val1 + val2;
            System.out.println("El resultado dentro de la expresion es :" + result);
            return result;
        };
        resultado = suma.suma(100, 200);
        System.out.println(resultado);
    }
}
