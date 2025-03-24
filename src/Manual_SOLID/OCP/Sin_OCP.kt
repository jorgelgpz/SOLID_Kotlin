package Sin_OCP

class Calculadora {
    fun calcular(a: Int, b: Int, operacion: String): Int {
        return when (operacion) {
            "suma" -> a + b
            "resta" -> a - b
            else -> 0
        }
    }
}

fun main() {
    val calculadora = Calculadora()
    println("Resultado: ${calculadora.calcular(5, 3, "suma")}")
}