import java.util.Vector;

public class Main {
public static void main(String[] args) {

        PilaO pilaO = new PilaO();
        pilaO.push("Hola mundo");
        pilaO.push(1);
        pilaO.push(true);
        pilaO.push(2.2f);
        pilaO.pop();
        while (!pilaO.empty()) {
                System.out.println(pilaO.pop());
        }
}
}
