package Sin_LSP

open class Ave {
    open fun volar() {
        println("El ave está volando")
    }
}

class Avestruz : Ave() {
    override fun volar() {
        throw UnsupportedOperationException("Las avestruces no vuelan")
    }
}

fun main() {
    val ave: Ave = Avestruz()
    ave.volar()
}
