public class Main {

    public static void main(String[] args) {
        // Operadores lógicos
        // and (y), or (o) y not (no)

        boolean resultado;

        // con el operador logico and && el resultado sera verdadero si todas las
        // comparaciones lo son
        resultado = 5 > 5 && true && 10 > 9;
        System.out.println(resultado);

        resultado = false || false || false || true;
        System.out.println(resultado);

        resultado = (5 >= (2 * 3) || true) && (true && 10 > 5);
        System.out.println(resultado);

        System.out.println(!true); // true = false
                                   // false = true
    }
}
