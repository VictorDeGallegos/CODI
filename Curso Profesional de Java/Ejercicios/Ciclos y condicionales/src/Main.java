public class Main {
    public static void main(String[] args) {

        /*
         * Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un
         * alumno sea mayor igual a 70, en caso contrario mostrar el mensaje
         * "Reprobado".
         */
        int nota = 0;

        if (nota >= 70)
            System.out.println("APROBADO");
        else
            System.out.println("REPROBADO");

        /*
         * Dado 3 números enteros, mostrar en consola los números de forma ascendente,
         * de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
         */
        int n1 = 80, n2 = 7, n3 = 1, menor = 0, mayor = 0, medio = 0;

        if ((n1 > n2) && (n2 > n3)) { // 100>2 y 2<1
            menor = n3; // / 0
            mayor = n1; // / 0
            medio = n2;
        } // / 5 >= 10
        else if ((n2 > n3) && (n3 > n1)) {
            menor = n1;// / 1
            mayor = n2;// / 10
            medio = n3;
        } // / 10 >= 1
        else if ((n3 > n1) && (n1 > n2)) {
            menor = n2;// / 1
            mayor = n3;// / 10
            medio = n1;
        } /// 1 >= 5
        else {
            menor = n1;// / 1
            medio = n2;
            mayor = n3;// / 10
        }

        System.out.println("Ordenados: " + menor + ", " + medio + ", " + mayor);

        // Imprimir en consola la tabla de multiplicar del número 9.
        for (int i = 0; i < 10; i++) {
            System.out.println("La tabla del 9 es: 9 * " + i + " = " + 9 * i);
        }

        /*
         * Replicar la siguiente salida en consola:
         * 
         *
         **
         ***
         ****
         *****
         ******
         */
        int y = 1;
        while (y <= 6) {

            if (y == 1)
                System.out.println("*");
            else if (y == 2)
                System.out.println("**");
            else if (y == 3)
                System.out.println("***");
            else if (y == 4)
                System.out.println("****");
            else if (y == 5)
                System.out.println("*****");
            else if (y == 6)
                System.out.println("******");
            y++;

            if (y > 6) {
                break;
            }

        }

        /*
         * Replicar la siguiente salida en consola.
         *
         ***
         *****
         *******
         *********
         * Ayuda: Podrás apoyarte de ciclos anidados así como de los métodos println y
         * print
         */
        int z = 1;
        while (z <= 5) {

            if (z == 1)
                System.out.println("     *");
            else if (z == 2)
                System.out.println("    ***");
            else if (z == 3)
                System.out.println("   *****");
            else if (z == 4)
                System.out.println("  *******");
            else if (z == 5)
                System.out.println(" *********");
            z++;

            if (z > 5) {
                break;
            }

        }

        // Imprime en consola los primeros 10 numeros de la serie Fibonacci
        int var = 1, temp = 0, ante = 0;

        // INTENTO WHILE
        while (true) {

            System.out.println(ante);

            if (var > 35) {
                break;
            } else {
                temp = var;
                var = var + ante;
                ante = temp;
            }
            continue;
        }

        // Dado un número saber si este es primo o no.
        int varprimo = 721, conta = 0, primo = 0;

        for (int i = 1; i <= varprimo; i++) {
            conta = varprimo % i;

            if ((varprimo == 1) || (varprimo == 0))
                System.out.println("El número: " + var + ", es primo.");

            // System.out.println("evaluando: "+i+" / "+ var%i);
            if (conta == 0) {
                primo++;// System.out.println(var%i);

                if ((primo == 2))
                    System.out.println("El número: " + varprimo + ", es primo.");
                else if (primo > 2)
                    System.out.println("El número: " + varprimo + ", no es primo.");
            }
        }

        /*
         * Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará
         * cuando el último múltiplo sea menor a 20
         */
        for (int i = 0; i < 20; i++) {
            int mult = 2 * i;
            if (mult == 20) {
                break;
            }
            System.out.println(mult);
        }

        // Dado un número entero obtener su factorial.
        int num = 20, multi = 1;

        for (int i = 0; i <= num; i++) {
            if ((num != 0) && i >= 1)
                multi *= i;
        }

        System.out.println(multi);
    }
}
