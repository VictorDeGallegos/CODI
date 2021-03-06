public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }
    public void insertar(int dato) {
        NodoArbol nuevo = new NodoArbol(dato);
        if (raiz==null) {
            raiz = nuevo;
        } else {
            NodoArbol tmp = raiz;
            NodoArbol padre;
            while (true) {
                padre = tmp;
                if (dato<tmp.dato) { // lo estamos mandando a la izquierda
                    tmp = tmp.hijoI;
                    if (tmp == null) {
                        padre.hijoI = nuevo;
                        return;
                    }
                } else { // lo estamos mandando a la derecha
                    tmp = tmp.hijoD;
                    if (tmp==null) {
                        padre.hijoD = nuevo;
                        return;
                    }
                }
            }
        
        }
    }

    public boolean vacio() {
        return raiz == null;
    }

    public void ver(NodoArbol nodo) {
        if (nodo!= null) {
            ver(nodo.hijoI);
            System.out.println(nodo.dato);
            ver(nodo.hijoD);
        }
    }
}

