def hola(&bloque)
  otro_hola(&bloque)
end

def otro_hola(&block)
  puts 'Mandado a llamar desde otro_hola'
  block.call
end

hola { puts 'Hola mundo' }
