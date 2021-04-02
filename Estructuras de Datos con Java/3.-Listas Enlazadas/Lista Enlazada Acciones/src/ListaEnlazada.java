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
public void agregarFinal() {

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
public void eliminar() {

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
