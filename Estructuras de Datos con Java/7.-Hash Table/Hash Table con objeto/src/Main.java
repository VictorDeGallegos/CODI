import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Main {
public static void main(String[] args) {
        Persona p1 = new Persona("Jose",30);
        Persona p2 = new Persona("Victor",21);
        Persona p3 = new Persona("Maria",20);

        Hashtable<String,Persona> tabla = new Hashtable<String,Persona>();
        tabla.put(p1.getName(),p1);
        tabla.put(p2.getName(),p2);
        tabla.put(p3.getName(),p3);

        String tmp;
        Enumeration<String> keys = tabla.keys();
        while (keys.hasMoreElements()) {
                tmp = keys.nextElement();
                System.out.println(tabla.get(tmp));
        }
}
}
