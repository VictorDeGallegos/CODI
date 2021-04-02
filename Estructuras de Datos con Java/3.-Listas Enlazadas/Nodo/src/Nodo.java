/**
 * Esta clase Nodo solo es para representar la estructura que se utilizará en Lista Enlazada Acciones
 *
 * @author Victor Gallegos
 */
public class Nodo {
int dato;
Nodo referencia;

//Definir constructor
public Nodo (int d) {
        dato = d;
}

public int getDato(){
        return dato;
}
public int setRef(Nodo referencia){
        ref = referencia;
}
public void getRef(){
        return ref;
}
}
