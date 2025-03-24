package Sin_SRP

class Usuario(val nombre: String, val edad: Int) {
    fun guardarUsuario() {
        println("Guardando usuario en la base de datos...")
    }

    fun imprimirUsuario() {
        println("Nombre: $nombre, Edad: $edad")
    }
}

fun main() {
    val usuario = Usuario("Juan", 25)
    usuario.guardarUsuario()
    usuario.imprimirUsuario()
}