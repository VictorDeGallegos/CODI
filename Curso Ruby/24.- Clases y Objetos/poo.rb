class Video
  attr_accessor :minutes, :title

  def play; end

  def pause; end

  def stop; end
end

video_24_curso_ruby = Video.new #Objeto o intancia de la clase video

video_24_curso_ruby.title = 'Objetos y clases'

video_25_curso_ruby = Video.new #Objeto o intancia de la clase video

video_25_curso_ruby.title = 'Atributos'

puts video_24_curso_ruby.title

puts video_25_curso_ruby.title
