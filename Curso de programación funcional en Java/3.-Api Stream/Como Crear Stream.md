# Podemos generar un Stream a partir de...

- COLECCION

- STREAM

- ARREGLO

-SECUENCIA

```java

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main{
     public static void main(String[] args) {


        //COLECCION
        List<User> users = new ArrayList<User>();
        Stream<User> stream = users.stream(); //Abstraccion

        //STREAM
        Stream<User> filter = stream.filter(user -> user.getAge() > 18);

        //Arreglo
        int[] numbers = {1,2,3,4}
        Stream numbersS = Stream.of(numbers);

        //Secuencia
        Stream names = Stream.of("Hugo 1", "Hugo 2", "Hugo 3");
     }
}
```
