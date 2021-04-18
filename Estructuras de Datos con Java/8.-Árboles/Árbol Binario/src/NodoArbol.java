public class NodoArbol{
   int dato;
   NodoArbol hijoI, hijoD;

public NodoArbol(int d) {
    dato = d;
    hijoD = hijoI = null;
}

@Override
public String toString() {
    return "NodoArbol [dato=" + dato + "]";
}

   
    
}