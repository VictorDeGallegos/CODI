import java.util.Vector;

public class Main {

public static void main(String[] args) {
        Vector vector = new Vector(20);
        vector.add("h");
        vector.add("Hola");
        vector.insertElementAt("jj", 1);
        System.out.println(vector);
        vector.remove("h");
        System.out.println(vector);
        System.out.println(vector.elementAt(0));
}
}
