
public class ListaEnlazadaDoble {
NodoD primero,ultimo;
int tamaño;

public ListaEnlazadaDoble(){
}

public void agregar(int dato){
        NodoD nuevo = new NodoD(dato);
        if(tamaño ==0) {
                primero = nuevo;
                primero = ultimo = nuevo;
        }else{
                nuevo.atras = ultimo;
                ultimo.adelante = nuevo;
                ultimo = nuevo;
        }
        tamaño++;
}

public void agregarinicio(int dato){
        NodoD nuevo = new NodoD(dato);
        if(tamaño==0) {
                primero=nuevo;
                ultimo = nuevo;
        } else {
                nuevo.adelante = primero;
                primero.atras = nuevo;
                primero = nuevo;
        }
        tamaño++;
}
public void eliminar(){
}
public void eliminarInicio(){
}
public void verLista(){
        NodoD nodov;
        nodov = primero;
        while (nodov!= null) {
                System.out.print(nodov.dato);
                nodov = nodov.adelante;
        }
}

}
