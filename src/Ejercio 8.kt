data class Fritanga(
        val Cliente: String,
        val Platillo: String,
        val Precio: Double
        )

fun main(args: Array<String>) {
    val orden1 = Fritanga("Juan", "Bandeja Paisa", 15000.0)
    val orden2 = Fritanga("Maria", "Arepa con Queso", 5000.0)
    val orden3 = Fritanga("Carlos", "Empanada", 3000.0)

    println(orden1)
    println(orden2)
    println(orden3)

}