# Es una cadena inmutable, es decir no se puede modificar la cadena en tiempo de ejecucion

cadena = :"Victor"
cadena2 = 'Victor'

simbolo = :Uriel
simbolo2 = :Uriel

puts cadena.object_id
puts cadena2.object_id

puts simbolo.object_id
puts simbolo2.object_id

#¿Cuando debo utilizar simbolos?
#1.- Cuando no necesito modificar el string
#2.- Cuando no necesito los metodos del string
#3.- Los simbolos se usan como nombres
