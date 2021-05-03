#FORMAS DE REPRESENTAR STRINGS

# irb(main):001:0> "Hola mundo"
# => "Hola mundo"
# irb(main):002:0> 'Hola mundo'
# => "Hola mundo"
# irb(main):003:0> nombre = "Victor"
# irb(main):004:0> "hola " + nombre
# => "hola Victor"
# irb(main):005:0> nombre = "Hugo"
# irb(main):006:0> "hola " + nombre
# => "hola Hugo"
# irb(main):008:0> "Hola #{ nombre  }"
# => "Hola Hugo"
# irb(main):009:0>
# irb(main):009:0> "Hola #{ 20 + 20  }"
# => "Hola 40"
# irb(main):011:0> "Hola #{ nombre.upcase }"
# => "Hola HUGO"
# irb(main):013:0> "VICTOR".downcase
# => "victor"
# irb(main):014:0> "León"
# => "León"
