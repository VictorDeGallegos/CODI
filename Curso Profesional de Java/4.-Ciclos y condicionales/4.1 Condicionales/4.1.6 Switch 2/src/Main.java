public class Main {
    public static void main(String[] args) {

        char calificacion = 'B';

        switch (calificacion) {
        case 'A':

            System.out.println("Excelente");

            break;
        case 'B':

        case 'C':

            System.out.println("Bien hecho");

            break;
        case 'D':

            System.out.println("Puedes mejorar");

            break;
        case 'F':

            System.out.println("Reprobado");

            break;

        default:
            System.out.println("Calificacion no valcalificacio");
            break;
        }
    }
}
