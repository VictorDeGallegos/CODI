public class Cola {

NodoCola primero,ultimo;
int tamaño;

public Cola(){
        primero = ultimo = null;
        tamaño = 0;
}


public boolean empty(){
        return primero == null;
}

public void insert(int dato){
        NodoCola nuevo = new NodoCola(dato);
        if(empty()) {
                primero = nuevo;
        }else {
                ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        tamaño++;
}


public int delete(){
        int tmp = primero.dato;
        primero = primero.siguiente;
        tamaño--;
        return tmp;
}

public int inicio(){
        return primero.dato;
}

public int size(){
        return tamaño;
}
}
