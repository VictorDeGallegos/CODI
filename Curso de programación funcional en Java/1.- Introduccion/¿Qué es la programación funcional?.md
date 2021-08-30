# ¿Qué es la programación funcional?

La programacion funcional no es mas que un paradigma de programacion, es decir es una forma en la que podemos resolver diferentes problematicas.

Cuando nos encontremos desarrollando software, utilizando este paradigma estaremos utilizando principalmente funciones, evitaremos los datos mutables asi como el hecho de compartir estados entre funciones.

La programacion funcional es un paradigma declarativo donde nos enfocaremos en que se esta haciendo? y no en como se esta haciendo?

No usarempos ciclos o condiciones

## Ejemplo en java

Java es un lenguaje orientado a objetos, sin embargo en versiones recientes podemos hacer uso de la programacion funcional

```java
// OBTENER LA CANTIDAD DE ELEMENTOS DE LA LISTA MAYORES A 10

import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Integer> numeros = List.of(18,6,4,15,55,78,12,9,8);

        //IMPERATIVO
        int contador = 0;
        for(int numero : numeros){
            if(numero >10){
                contador ++;
            }
        }
        System.out.println("contador");

        //DECLARATIVO
        Long resultado = numeros.stream().filter(n -> n > 10).count();
        System.out.println(resultado)
    }
}
```

## Las funciones puras

Las funciones puras, no son mas que funciones, las cuales, dando el mismo input, siempre retornan el mismo output, ademas de no tener efectos secundarios

## La composicion de funciones

La composicion de funciones es el proceso de combinar dos o mas funciones, teniendo como finalidad ejecutar cada una de estas funciones en secuencia para obtener un resultado en concreto

EJEMPLO:

f(x)
g(x)

=f(g(x))

## El estado compartido

El estado compartido es cualquier variable, objeto o espacio de memoria que exista en un ambito compartido

EJEMPLO:

Materia materia = new Materia();
Usuario usuario = new Usuario();

usuario.materia = materia;

## Objeto Mutable

Un objeto mutable es aquel que no puede ser modificado una vez haya sido creado
