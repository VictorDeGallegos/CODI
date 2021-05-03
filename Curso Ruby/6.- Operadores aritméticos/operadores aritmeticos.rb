# Operador	Descripción
# **	Exponencial
# *, /, %	Multiplicación, división, modulo
# +, –	Suma y resta

# irb(main):001:0> x = 10
# irb(main):002:0> y = 5
# irb(main):003:0> x + y
# => 15
# irb(main):004:0> puts (20+10)
# 30
# => nil

# irb(main):005:0> x - y
# => 5

# irb(main):006:0> x * y
# => 50
# irb(main):007:0> x / y
# => 2

numero = gets.chomp

numero = numero.to_i

residuo = numero % 2

puts "#{numero} es par" if residuo == 0
