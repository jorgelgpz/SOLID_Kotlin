package Con_LSP

open class Ave
open class AveVoladora : Ave() {
    open fun volar() {
        println("El ave está volando")
    }
}

class Avestruz : Ave()
class Aguila : AveVoladora()

fun main() {
    val aguila = Aguila()
    aguila.volar()
}
