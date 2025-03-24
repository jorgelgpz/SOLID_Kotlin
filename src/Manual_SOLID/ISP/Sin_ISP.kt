package Sin_ISP

interface Trabajador {
    fun programar()
    fun diseñar()
    fun testear()
}

class Programador : Trabajador {
    override fun programar() {
        println("Programando...")
    }

    override fun diseñar() {
        throw UnsupportedOperationException()
    }

    override fun testear() {
        throw UnsupportedOperationException()
    }
}
