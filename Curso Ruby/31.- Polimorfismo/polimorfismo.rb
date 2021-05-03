class Video
  def play; end
end

class Vimeo
  def play
    p 'Inserta el reproductor vimeo'
  end
end

class YouTube
  def play
    p 'Inserta el reproductor de YouTube'
  end
end

videos = [YouTube.new, Vimeo.new, Vimeo.new, YouTube.new, YouTube.new]

videos.each { |video| video.play }
