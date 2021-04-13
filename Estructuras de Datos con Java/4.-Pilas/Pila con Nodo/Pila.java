
public class Pila {
private NodoPila ultimo;
int tamaño;

public Pila(){
        ultimo = null;
        tamaño = 0;

}
//NOS REGRESA SI ESTA VACIO.
public boolean empty(){
        return ultimo == null;
}

//INSERTA UN ELEMENTO EN LA PILA.
public void push(int dato){
        NodoPila nuevo = new NodoPila(dato);
        nuevo.siguiente = ultimo;
        ultimo = nuevo;
        tamaño++;
}

//SACA UN ELEMENTO DE LA PILA.
public int pop(){
        int tmp = ultimo.dato;
        ultimo = ultimo.siguiente;
        tamaño--;
        return tmp;
}

//REVISA ULTIMO ELEMENTO DE LA PILA.
public int peek(){
        return ultimo.dato;
}

//NOS REGRESA EL TAMAÑO.
public int size(){
        return tamaño;
}

//LIMPIA LA PILA.
public void clear(){
        while (!empty()) {
                pop();
        }
}
}
