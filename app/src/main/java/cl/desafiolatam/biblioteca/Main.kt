package cl.desafiolatam.biblioteca

fun main(){
    val libro1 =  LibroEscolares("El Principito","9789567802517",1980,"Juan Carlos Sáez Editor",95,6000,"DE SAINT-EXUPERY, ANTOINE", "I" )
    val libro2 =  LibroEscolares("La Comunidad Del Anillo : El Señor De Los Anillos","9789562477062",2010," Minotauro Ediciones",547,14500," TOLKIEN, J. R. R.", "I" )
    val libro3 =  LibroEscolares("El Principe Caspian (Cronicas De Narnia #4)","9788408111610",1985,"Planeta",336,10000," LEWIS, C.S.", "D" )
    val libro4 =  LibroEscolares("Papelucho","9789563495683",2011,"SM Ediciones",144,4900," PAZ, MARCELA", "D" )

    val precio2 = libro1.precio


    println("Datos del libro :  ${libro1}")
  //  println("Datos del libro :  ${libro2}")
  // println("Datos del libro :  ${libro3}")
 //   println("Datos del libro :  ${libro4}")


    println("{$precio2.precioFormatiado()}")

}



