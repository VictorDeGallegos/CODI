
//ARRAY TRABAJA CON EL PASE DE REFERENCIA
public class Main {
public static void modificar(int x){
        x = 2;
}

public static void main(String[] args) {
        // int num[] = {1,2,3,4};
        int x = 1;
        modificar(x);
        System.out.println(x);
}
}
