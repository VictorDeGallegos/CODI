class Video
  @@de_clase = 'Clase woo'
  @de_instancia = 'Instancia yeii'

  def self.test
    p @@de_clase
    p @de_instancia
  end
end
class YouTube < Video
  def self.test
    @@de_clase = 'Clase cambiada'
    p @de_clase
    p @de_instancia
  end
end
Video.test
YouTube.test
