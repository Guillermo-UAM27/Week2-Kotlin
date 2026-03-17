
interface Vehiculo {
    fun mover()
}

class Camion : Vehiculo {
    override fun mover() {
        println("El camión se mueve lentamente transportando carga pesada.")
    }
}

class Motocicleta : Vehiculo {
    override fun mover() {
        println("La motocicleta se mueve rápidamente entre el tráfico.")
    }
}

fun main() {
    // Lista de vehículos  polimorfismo
    val transportes: List<Vehiculo> = listOf(Camion(), Motocicleta())

    for (transporte in transportes) {
        transporte.mover()
    }
}