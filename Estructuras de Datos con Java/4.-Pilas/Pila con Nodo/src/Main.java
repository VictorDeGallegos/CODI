import java.util.Vector;
public class Main {
public static void main(String[] args) {

        Pila pila = new Pila();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.pop();
        pila.pop();
        while (!pila.empty()) {
                System.out.println(pila.pop());
        }
}
}
