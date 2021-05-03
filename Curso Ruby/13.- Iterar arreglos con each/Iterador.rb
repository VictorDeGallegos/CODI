#CICLO EACH

calificaciones = %w[10 7 8 9 5 8 10]

suma = 0
calificaciones.each.with_index do |calificacion, posicion|
  suma += calificacion.to_i
end

puts "El promedio de calificacion es #{suma / calificaciones.length}"
