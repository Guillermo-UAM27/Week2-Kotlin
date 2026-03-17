class Estudiantes (private var nombre:String,
                   private var carrera:String,
                   private var carnet:String,
                   private var ano: Int)
{
    fun mostrarDatos()
    {
        println("Nombre: $nombre")
        println("Carrera: $carrera")
        println("Carnet: $carnet")
        println("Año: $ano")
    }
}

fun main()
{
    val estudiante1 = Estudiantes("Juan Perez", "Ingeniería en Sistemas", "2021001", 2021)
    val estudiante2 = Estudiantes("Maria Gomez", "Medicina", "2021002", 2021)
    val estudiante3 = Estudiantes("Carlos Ramirez", "Derecho", "2021003", 2021)
    println("Datos del Estudiante 1:")
    estudiante1.mostrarDatos()

    println("\nDatos del Estudiante 2:")
    estudiante2.mostrarDatos()

    println("\nDatos del Estudiante 3:")
    estudiante3.mostrarDatos()
}