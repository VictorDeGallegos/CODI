
public class Main {
    // While
    public static void main(String[] args) {

        int contador = 0;
        int numero = 1234;

        //

        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }
        System.out.println("El numero posee " + contador + " Digitos");
    }

}
