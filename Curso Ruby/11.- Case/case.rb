print 'Dame tu calificacion (1-10): '
calificacion = gets.chomp.to_i

# if calificacion == 10 || calificacion == 9
#   puts 'Excelente!'
# elsif calificacion == 8
#   puts 'Bien, pero aun puedes mejorar'
# elsif calificacion == 7
#   puts 'Repasa'
# elsif calificacion == 6
#   puts 'Repasa mas'
# else
#   puts 'Reprobado'
# end

puts case calificacion
     when 10
       'Excelenteee'
     when 9
       'Excelentee'
     when 8
       'Excelente'
     when 7
       'Bien'
     when 6
       'Regular'
     else
       'Reprobado'
     end
