class Taxi(val placa: String,
           val conductor: String,
            val modelo: String,)
{
    fun iniciarServicio() {
        println("El taxi con placa $placa, conducido por $conductor, modelo $modelo ha iniciado su viaje.")
    }
}
fun main() {
    val taxi1 = Taxi("ABC123", "Juan Perez", "Toyota Corolla")
    val taxi2 = Taxi("XYZ789", "Maria Gomez", "Honda Civic")
    val taxi3 = Taxi("LMN456", "Carlos Sanchez", "Ford Focus")

    taxi1.iniciarServicio()
    taxi2.iniciarServicio()
    taxi3.iniciarServicio()
}