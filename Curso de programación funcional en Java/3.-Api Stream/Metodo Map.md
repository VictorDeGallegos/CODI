# MÉTODO MAP

El método map nos permite transformar un objeto en otro a través de una función.

![image](https://user-images.githubusercontent.com/41756950/131443031-6a0f4099-e2ba-4728-8d3d-00ce16db9494.png)

## Aquí algunos ejemplos.

Generar una lista de números enteros apartir de la lista ya existente.

```bash
List<String> strings = List.of("1", "2", "3", "4");

List<Integer> numeros = strings.stream()
                        .map(x -> Integer.parseInt(x))
                        .collect(Collectors.toList())
```

Imprimir en consola los strings con todas sus letras en mayúsculas.

```bash
List<String> strings = List.of("a", "b", "codi");

strings = strings.stream()
                    .map(string -> string.toUpperCase())
                    .collect(Collectors.toList())

System.out.println(strings);
```

Generar una lista de valores booleanos los cuales hagan referencia a las calificaciones de los alumnos. La calificación minima aprovatoria es 6.

```bash
List<Integer> calificaciones = List.of(9, 8, 9, 5, 10, 7);

List<Boolean> booleans = calificaciones.stream()
                            .map(x -> x > 5)
                            .collect(Collectors.toList());

System.out.println(booleans);
```

En ocasiones tendremos la necesidad de transformar objetos regulares a streams primitivos o viceversa. En esos casos podemos hacer uso de métodos tales cómo :

- mapToInt
- mapToLong
- mapToDouble
