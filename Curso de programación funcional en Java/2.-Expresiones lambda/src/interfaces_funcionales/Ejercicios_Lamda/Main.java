package interfaces_funcionales.Ejercicios_Lamda;

public class Main {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
    }

    public static void ejercicio1() {
        ILambda1 lambda = (array) -> {
            double promedio = 0;
            for (int e : array) {
                promedio += (e * 1.0) / array.length;
            }
            return promedio;
        };
        int arreglo[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println("El promedio es: " + lambda.promedio(arreglo));
    }

    public static void ejercicio2() {
        ILambda2 lambda = (n) -> {
            double factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        };

        System.out.println("El factorial de 5 es: " + lambda.factorial(5));
    }

    public static void ejercicio3() {
        ILambda3 lambda = n -> n % 2 == 0;
        if (lambda.esPar(6))
            System.out.println("Es par");
        else
            System.out.println("No es par");
    }

    public static void ejercicio4() {
        ILambda4 lambda = (array) -> {
            int mayor = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > mayor)
                    mayor = array[i];
            }
            return mayor;
        };
        int arreglo[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println("El mayor es: " + lambda.mayor(arreglo));
    }

    public static void ejercicio5() {
        ILambda5 lambda = (array) -> {
            int menor = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < menor)
                    menor = array[i];
            }
            return menor;
        };
        int arreglo[] = { 1, 2, 3, 4, 5, 6 };

        System.out.println("El menor es: " + lambda.menor(arreglo));
    }

    public static void ejercicio6() {
        ILambda6 lambda = (array) -> {
            int nRepeticiones = 0, masRepetido = 0;
            for (int i = 0; i < array.length; i++) {
                int rep = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        rep++;
                    }
                }
                if (rep > nRepeticiones) {
                    nRepeticiones = rep;
                    masRepetido = array[i];
                }
            }
            return masRepetido;
        };
        int arreglo[] = { 1, 2, 3, 4, 1, 2, 4, 7, 8, 8, 5, 3, 4, 8, 5, 6, 8, 2, 4, 2, 5, 2, 1 };

        System.out.println("el mas repetido es: " + lambda.masRepetido(arreglo));
    }

    public static void ejercicio7() {
        ILambda7 lambda = (a, b, c) -> {
            int mayor = c;
            if (a > b && a > c)
                mayor = a;
            else if (b > a && b > c)
                mayor = b;

            return mayor;
        };

        System.out.println("El mayor es: " + lambda.mayorDe3(53, 12, 40));
    }

    public static void ejercicio8() {
        ILambda8 lambda = (s, n) -> {
            String result = "";
            for (int i = 1; i <= n; i++) {
                result += s;
            }
            return result;
        };

        System.out.println(lambda.multiplica("Hugo", 4));
    }
}
