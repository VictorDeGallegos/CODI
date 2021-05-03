playlist = ['First song', 'Second song', 'Third song']

playing = true

index_song = 0

#Si hay canciones en la list de reproduccion y se está reproduciendo (playing = true) => se ejecuta

while (index_song < playlist.length) && playing
  puts "Reproduciendo #{playlist[index_song]}"

  index_song += 1

  #Si nos manda 0, hacemos stop , sino seguimos reproduciendo
  print 'Colca 0 para detener la reproduccion: '
  respuesta = gets.chomp.to_i

  playing = false if respuesta == 0
end
