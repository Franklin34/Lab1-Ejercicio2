package modelo

class Videojuego: Entregable{

    private var titulo: String = ""
    private var horasEstimadas: Int = 10
    private var entregado: Boolean = false
    private var genero: String = ""
    private var compania: String = ""

    constructor()

    constructor(titulo: String, horasEstimadas: Int) {
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
    }

    constructor(titulo: String, horasEstimadas: Int, genero: String, compania: String){
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
        this.genero = genero
        this.compania = compania
    }

    override fun entregar() {
        this.entregado = true
    }

    override fun devolver() {
        this.entregado = false
    }

    override fun isEntregado(): Boolean {
        return this.entregado
    }
}