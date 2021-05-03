#Cantidad de dimensione

#Arreglos internos deben tener la misma cantidad de elementos
#Matrix => Todos los elementos deben ser números
require 'matrix'
# [
#      1 8 3
#      5 2 2
#      5 2 2
# ]

matriz = Matrix[[1, 8, 3], [5, 2, 2], [5, 2, 2]]

matriz.each(:strict_upper) { |i| puts i }
