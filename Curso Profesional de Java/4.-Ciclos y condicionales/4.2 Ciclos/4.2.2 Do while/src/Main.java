public class Main {
    public static void main(String[] args) {
        // Do While
        int contador = 10;
        // Con el ciclo while -> 1ero Se evalua 2.- Se ejecuta el bloque
        // Con el siclo dowhile -> 1ero se ejecuta el bloque 2.- se evalua
        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10);
    }
}
