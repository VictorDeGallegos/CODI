/**
 * ListaEnlazada representa la estructura y los metodos posibles para interactuar con ella, no siempre seran public void
 *
 * @author Victor Gallegos
 */

public class ListaEnlazada {
//Construir un constructor, una lista ListaEnlazada siempre tendra un nodo como referencia
protected Nodo primero;

public ListaEnlazada(){
        primero = null;
}


/**
 * @agregarInicio() agrega un nuevo elemento a la ListaEnlazada
 * @param dato tipo entero
 * @return this
 **/
public ListaEnlazada agregarInicio(int dato){
        Nodo nuevo;
        nuevo = new Nodo(dato);
        nuevo.ref = primero;
        primero = nuevo;
        return this;
}

/**
 * @agregarFinal, agrega un elemento al final de la ListaEnlazada
 * @param param_name your_param_description
 * @return return_type your_return_description
 **/
public void agregarFinal(int dato) {
        Nodo nuevoF;
        nuevoF = new Nodo(dato);
        nuevoF.ref = null;

        if(primero == null) {
                primero = nuevoF;
                return;
        }
        Nodo tmp;
        for (tmp = primero; tmp.getRef() != null; tmp=tmp.getRef());
        tmp.setRef(nuevoF);


}

/**
 * @buscar() busca un elemento en una ListaEnlazada
 * @param param_name your_param_description
 * @return return_type your_return_description
 **/
public void buscar() {

}

/**
 * @eliminar() elimina un elemento de una ListaEnlazada
 * @param param_name your_param_description
 * @return return_type your_return_description
 **/
public void eliminar(int dato) {
        boolean encontrado;
        Nodo actual, anterior;
        actual = primero;
        anterior = null;
        encontrado = false;

        while (actual != null && !encontrado) {
                encontrado = (actual.dato == dato);
                if(!encontrado) {
                        anterior = actual;
                        actual = actual.getRef();
                }
        }

        if(actual != null) {
                if(actual == primero) {
                } else {
                        anterior.setRef(actual.ref);
                }

        }
}


/**
 * @verLista() ver la ListaEnlazada
 * @param param_name your_param_description
 * @return return_type your_return_description
 **/
public void verLista() {
        Nodo nodov;
        nodov = primero;
        while (nodov != null) {
                System.out.println(nodov.dato);
                nodov = nodov.ref;
        }
}
}
