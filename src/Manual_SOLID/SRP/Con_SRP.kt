package Con_SRP

class Usuario(val nombre: String, val edad: Int)

class UsuarioRepository {
    fun guardar(usuario: Usuario) {
        println("Guardando usuario: ${usuario.nombre}")
    }
}

class UsuarioPrinter {
    fun imprimir(usuario: Usuario) {
        println(
            "Nombre: ${usuario.nombre}" +
                    "Edad: ${usuario.edad}"
        )
    }
}

fun main() {
    val usuario = Usuario("Juan", 25)
    val repository = UsuarioRepository()
    val printer = UsuarioPrinter()

    repository.guardar(usuario)
    printer.imprimir(usuario)
}