// Usamos Libro10 para evitar conflictos con otros ejercicios en la misma carpeta
class Libro10(
    val titulo: String,
    val autor: String,
    val añoPublicacion: Int
) {
    // Método para mostrar los detalles del libro
    fun mostrarInformacion() {
        println("Título: $titulo | Autor: $autor | Año: $añoPublicacion")
    }
}

fun main() {
    // Registramos los 4 libros de tecnología/programación
    val libro1 = Libro10("Clean Code", "Robert C. Martin", 2008)
    val libro2 = Libro10("Kotlin in Action", "Dmitry Jemerov", 2017)
    val libro3 = Libro10("The Pragmatic Programmer", "Andrew Hunt", 1999)
    val libro4 = Libro10("Head First Design Patterns", "Eric Freeman", 2004)

    // Los metemos en una lista para mostrarlos todos elegantemente
    val biblioteca = listOf(libro1, libro2, libro3, libro4)

    println("--- Registro de Biblioteca Universitaria ---")
    biblioteca.forEach { it.mostrarInformacion() }
}