package Manual_SOLID.OCP

interface Operacion {
    fun ejecutar(a: Int, b: Int): Int
}

class Suma : Operacion {
    override fun ejecutar(a: Int, b: Int) = a + b
}

class Resta : Operacion {
    override fun ejecutar(a: Int, b: Int) = a - b
}

class Calculadora {
    fun calcular(operacion: Operacion, a: Int, b: Int): Int = operacion.ejecutar(a, b)
}

fun main() {
    val calculadora = Calculadora()
    println("Suma: ${calculadora.calcular(Suma(), 5, 3)}")
    println("Resta: ${calculadora.calcular(Resta(), 5, 3)}")
}