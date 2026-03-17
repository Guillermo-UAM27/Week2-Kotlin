class CuentaBancaria(private val numeroCuenta: String, private var saldo: Double) {

    fun depositar(cantidad: Double) {
        if (cantidad > 0) {
            saldo += cantidad
            println("Depósito exitoso. Nuevo saldo: $saldo")
        }
    }

    fun retirar(cantidad: Double) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Retiro exitoso. Nuevo saldo: $saldo")
        } else {
            println("Fondos insuficientes.")
        }
    }

    fun consultarSaldo() {
        println("Cuenta: $numeroCuenta - Saldo actual: $saldo")
    }
}

fun main() {
    // Ejemplo de uso
    val miCuenta = CuentaBancaria("123456789", 1000.0)

    miCuenta.consultarSaldo()
    miCuenta.depositar(500.0)
    miCuenta.retirar(200.0)
}