import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Main {
public static void main(String[] args) {
        Persona p1 = new Persona("Valentina",1);
        Persona p2 = new Persona("Margarita",2);
        Persona p3 = new Persona("Julián",3);
        Persona p4 = new Persona("Xochitl",4);
        Persona p5 = new Persona("Kyle",5);




        Hashtable<String,Persona> tabla = new Hashtable<String,Persona>();
        tabla.put(p1.getName(),p1);
        tabla.put(p2.getName(),p2);
        tabla.put(p3.getName(),p3);
        tabla.put(p4.getName(),p4);
        tabla.put(p5.getName(),p5);

        String tmp;
        Enumeration<String> keys = tabla.keys();
        while (keys.hasMoreElements()) {
                tmp = keys.nextElement();
                System.out.println(tabla.get(tmp));
        }
}
}
