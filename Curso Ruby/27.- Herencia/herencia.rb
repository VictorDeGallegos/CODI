class Video
  attr_accessor :title
  attr_accessor :duration
  attr_accessor :description

  def embed_video_code
    '<video></video'
  end

  def setup(title)
    @title = title
  end
end

class YoutubeVideo < Video
  attr_accessor :youtube_id

  def embed_video_code
    'iframe />'
  end

  def setup(title)
    super

    #YoutubeAPI.init()
    puts 'Algo Extrta'
  end
end

video = Video.new #Objeto o intancia de la clase video
video.setup('Demo')

yt = YoutubeVideo.new #Objeto o intancia de la clase video

yt.setup('Herencia Ruby')

puts yt.title
