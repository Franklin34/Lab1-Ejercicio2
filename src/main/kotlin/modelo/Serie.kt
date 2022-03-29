package modelo

class Serie : Entregable{

    private var titulo: String = ""
    private var numTemporadas: Int = 3
    private var entregado: Boolean = false
    private var creador: String = ""
    private var genero: String = ""

    constructor(titulo: String, numTemporadas: Int, creador: String, genero: String) {
        this.titulo = titulo
        this.numTemporadas = numTemporadas
        this.creador = creador
        this.genero = genero
    }

    constructor()

    constructor(titulo: String, creador: String){
        this.titulo = titulo
        this.creador = creador
    }

    override fun entregar() {
        entregado = true
    }

    override fun devolver() {
       entregado = false
    }

    override fun isEntregado(): Boolean {
        return entregado
    }
}