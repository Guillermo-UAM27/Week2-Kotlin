data class Product(val nombre: String, val precio: Double, val cantidad: Int)

fun main() {
    val producto1 = Product("Arroz", 1200.0, 5)
    val producto2 = Product("Frijoles", 800.0, 10)
    val producto3 = Product("Azucar", 500.0, 7)
    val producto4 = Product("Aceite", 500.0, 7)
    val producto5 = Product("Jabon", 500.0, 7)

    println("Producto 1: $producto1")
    println("Producto 2: $producto2")
    println("Producto 3: $producto3")
    println("Producto 4: $producto4")
    println("Producto 5: $producto5")
}