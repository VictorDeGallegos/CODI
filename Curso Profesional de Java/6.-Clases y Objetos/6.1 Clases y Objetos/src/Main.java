public class Main {
    public static void main(String[] args) {

        // Clases y Objetos

        Perro chihuahua = new Perro(); // INSTANCIA O OBJETO CREADO

        chihuahua.nombre = "Bambi";
        chihuahua.raza = "Chihuahua";
        chihuahua.edad = 6;

        System.out.println("El nombre del chihuahua es " + chihuahua.nombre);

        System.out.println("La raza es " + chihuahua.raza);

        System.out.println("La edad es " + chihuahua.edad);
    }
}
