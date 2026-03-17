open class Persona1(val nombre: String, val edad: Int)

class Docente(nombre: String, edad: Int, val materia: String) : Persona1(nombre, edad)


class Estudiante(nombre: String, edad: Int, val carrera: String) : Persona1(nombre, edad)

fun main() {
    val profe = Docente("Allan", 45, "Programación")
    val alumno = Estudiante("Lito", 20, "Ingeniería")


    val comunidadEducativa = listOf(profe, alumno)

    comunidadEducativa.forEach {
        if (it is Docente) {
            println("Docente: ${it.nombre}, Materia: ${it.materia}")
        } else if (it is Estudiante) {
            println("Estudiante: ${it.nombre}, Carrera: ${it.carrera}")
        }
    }
}