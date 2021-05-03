class Usuaio
  attr_accessor :nombre

  def saludar
    yield(@nombre)
  end
end

uriel = Usuaio.new #Objeto o intancia de la clase

uriel.nombre = 'Uriel'

uriel.saludar { |nombre| puts "Hola #{nombre}" }
uriel.saludar { |nombre| puts "Hello #{nombre}" }
