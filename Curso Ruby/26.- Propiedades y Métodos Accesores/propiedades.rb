class Tutor
  attr_accessor :nombre #   DEFINE GETTER Y SETTER

  #   attr_reader :nombre      DEFINE GETTER
  #   attr_writer :nombre     DEFINE SETTER
  def initialize(name)
    @nombre = name
  end
end

uriel = Tutor.new('Uriel')
jose = Tutor.new('Jose')

puts uriel.nombre

uriel.nombre = 'Marcos'

puts uriel.nombre
