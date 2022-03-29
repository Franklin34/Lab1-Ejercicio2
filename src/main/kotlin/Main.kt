import modelo.Serie
import modelo.Videojuego

fun main(args: Array<String>) {

    var series = arrayOf<Serie>()
    var videojuegos = arrayOf<Videojuego>()

    val serie1 = Serie("Shadowhunters", 10, "Franklin", "Miedo")
    val serie2 = Serie("Casa papel", 6, "Daniel", "Suspenso")
    val serie3 = Serie("Casa papel", "Mauricio")
    val serie4 = Serie("Dark", 6, "Jk Rowling", "Misterio")
    val serie5 = Serie("Juego Calamar", 6, "Daniel", "Drama")

    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)

    var videojuego1 = Videojuego("Crash", 30)
    var videojuego2 = Videojuego("Uncharted", 30, "Aventura", "EA")
    var videojuego3 = Videojuego("Clash Royale", 30, "Casual", "Supercell")
    var videojuego4 = Videojuego("Fornite", 30)
    var videojuego5 = Videojuego("League of legends", 1000)

    videojuegos = videojuegos.plus(videojuego1)
    videojuegos = videojuegos.plus(videojuego2)
    videojuegos = videojuegos.plus(videojuego3)
    videojuegos = videojuegos.plus(videojuego4)
    videojuegos = videojuegos.plus(videojuego5)

    videojuegos.get(1).entregar()
    videojuegos.get(3).entregar()
    videojuegos.get(2).entregar()

    series.get(1).entregar()
    series.get(3).entregar()

    var contadorSeries: Int = 0

    for(i in series.indices) {
        if(series.get(i).isEntregado()){
            contadorSeries++
            series.get(i).devolver()
        }
    }

    var contadorVideojuegos: Int = 0

    for(i in videojuegos.indices) {
        if(videojuegos.get(i).isEntregado()){
            contadorVideojuegos++
            videojuegos.get(i).devolver()
        }
    }

    println("La cantidad de series entregadas es " + contadorSeries)
    println("La cantidad de videojuegos entregados es " + contadorVideojuegos)

    println("Program arguments: ${args.joinToString()}")
}