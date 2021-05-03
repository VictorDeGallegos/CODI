numero_magico = 20

print 'adivina el numero magico: '
numero_usuario = gets.chomp.to_i

while numero_usuario != numero_magico
  print 'Incorrecto. adivina el numero magico otra vez:  '
  numero_usuario = gets.chomp.to_i
end

puts 'Felicidades. adivinaste '
