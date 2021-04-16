import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Main {
public static void main(String[] args) {
        Hashtable<String,String> tabla = new Hashtable<String,String>();
        tabla.put("Jose","Mexicano");
        tabla.put("Manuel","Guatemalteco");
        tabla.put("Ana", "Rusa");
        System.out.println(tabla.get("Jose"));
}
}
