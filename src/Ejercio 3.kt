class bus(
    val marca: String,
    val modelo: String,
    val año: Int,
    val capacidad: Int
) {
    fun iniciaaRuta() {
        println("El bus $marca $modelo del año $año ha iniciado su viaje con una capacidad de $capacidad pasajeros.")
    }
}

fun main() {
    val bus1 = bus("Mercedes-Benz", "Sprinter", 2020, 20)
    val bus2 = bus("Volvo", "B9R", 2018, 50)
    val bus3 = bus("Scania", "K360IB", 2019, 40)

    bus1.iniciaaRuta()
    bus2.iniciaaRuta()
    bus3.iniciaaRuta()
}