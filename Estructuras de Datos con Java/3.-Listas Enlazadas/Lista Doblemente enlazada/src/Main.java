public class Main {
public static void main(String[] args) {
        ListaEnlazadaDoble listaEnlazdaDoble = new ListaEnlazadaDoble();
        listaEnlazdaDoble.agregar(1);
        listaEnlazdaDoble.agregar(2);
        listaEnlazdaDoble.agregar(3);
        listaEnlazdaDoble.agregar(4);
        listaEnlazdaDoble.agregarInicio(5);
        listaEnlazdaDoble.eliminarInicio();
        listaEnlazdaDoble.eliminarFinal();
        listaEnlazdaDoble.verLista();
}
}
