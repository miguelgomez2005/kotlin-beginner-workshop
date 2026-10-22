package ejercicio06
class Product(val nombre: String, val precio: Double, val cantidad: Int) {
    fun calcularValorInventario(): Double = precio * cantidad

    fun mostrarInformacion() {
        println("Producto: $nombre | Precio: $$precio | Cantidad: $cantidad | Valor Total: $${calcularValorInventario()}")
    }
}

fun main() {
    println("=== Ejercicio 6: Gestión de Productos ===")
    val productos = mutableListOf<Product>()

    for (i in 1..3) {
        println("\n--- Ingrese los datos del producto $i ---")
        print("Nombre: ")
        val nombre = readln()
        print("Precio: ")
        val precio = readln().toDoubleOrNull() ?: 0.0
        print("Cantidad disponible: ")
        val cantidad = readln().toIntOrNull() ?: 0

        productos.add(Product(nombre, precio, cantidad))
    }

    println("\n=== Inventario de Productos ===")
    for (p in productos) {
        p.mostrarInformacion()
    }
}