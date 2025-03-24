package Sin_DIP

class MotorGasolina {
    fun encender() {
        println("Motor de gasolina encendido")
    }
}

class Coche {
    private val motor = MotorGasolina()
    fun arrancar() {
        motor.encender()
    }
}

fun main() {
    val coche = Coche()
    coche.arrancar()
}