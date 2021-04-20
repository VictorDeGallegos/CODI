public class Main {
    public static void main(String[] args) {
        // Cast

        /*
         * Convertir valor de la variable a un tipo en concreto
         */
        int variableX = 50, variableY = 10;
        float variableZ = 5.5f;
        int resultado;
        float resultado2;

        resultado = variableX + (int) variableZ; // Resultado = 55.5

        resultado2 = (float) variableX + variableZ;

        System.out.println(resultado);
        System.out.println(variableZ);
        System.out.println((int) variableZ);
        System.out.println((int) variableZ);
        System.out.println(resultado2);
    }
}
