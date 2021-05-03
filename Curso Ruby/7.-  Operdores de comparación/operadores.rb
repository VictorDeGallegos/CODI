#Distintas formas de comparar 

# irb(main):001:0> 4<4
# => false
# irb(main):002:0> 4<40
# => true
# irb(main):002:0> 4<=5
# => true
# irb(main):003:0> 4<=>5
# => -1
# irb(main):004:0> 5<=>5
# => 0
# irb(main):005:0> 10 == 10
# => true
# irb(main):006:0> "Hola" == "hola"
# => false
# irb(main):007:0> 1 == 1.0
# => true
# irb(main):008:0> 1.eql?(1.0)
# => false
# irb(main):009:0> "hola".eql?("hola")
# => true
# irb(main):011:0> "hola".equal?("hola")
# => false
