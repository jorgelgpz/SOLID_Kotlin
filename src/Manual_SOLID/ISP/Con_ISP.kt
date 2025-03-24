package Con_ISP

interface Programador {
    fun programar()
}

interface Diseniador {
    fun diseñar()
}

interface Tester {
    fun testear()
}

class Desarrollador : Programador {
    override fun programar() {
        println("Programando...")
    }
}

fun main() {
    val desarrollador = Desarrollador()
    desarrollador.programar()
}
