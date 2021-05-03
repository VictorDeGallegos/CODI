numero_uno = gets.chomp.to_i
numero_dos = gets.chomp.to_i

if numero_uno > numero_dos
  puts "#{numero_uno} es mayor que #{numero_dos}"
elsif numero_uno == numero_dos
  puts 'Ambos numeros son iguales'
else
  puts "#{numero_uno} es menor que #{numero_dos}"
end
