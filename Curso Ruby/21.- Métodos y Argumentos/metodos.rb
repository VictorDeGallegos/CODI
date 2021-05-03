def square(x)
  #Retorna el cuadrado del numero del numero
  return 0 unless x.is_a?(Integer)
  x * x
end

def saludar
  puts 'Hola mundo'
end

saludar
puts square(2)
