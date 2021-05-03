def hola_gente(mensaje, *personas)
  personas.each { |personas| puts "Hola #{personas}" }
end

hola_gente(%w[Uriel Coco])
