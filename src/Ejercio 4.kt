open class Persona(val nombre: String, val apellido: String) {
    open fun saludar(): String {
        return "Hola, mi nombre es $nombre $apellido"
    }
}

class Empleado(
    nombre: String,
    apellido: String,
    val rol: String
) : Persona(nombre, apellido) {


    override fun saludar(): String {
        return "${super.saludar()}. Mucho gusto, mi rol es $rol."
    }
}

fun main() {
    val empleado = Empleado("Guillermo", "Gomez", "Programador")
    println(empleado.saludar())
}