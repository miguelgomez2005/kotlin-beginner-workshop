package ejercicio08
fun saludarUsuario(nombre: String?): String {
    return if (!nombre.isNullOrBlank()) {
        "¡Hola, $nombre! Qué bueno verte de nuevo."
    } else {
        "¡Hola, invitado! Bienvenido al sistema."
    }
}

fun main() {
    println("=== Ejercicio 8: Manejo de Valores Nulos ===")
    print("Ingrese su nombre (o presione Enter para dejarlo vacío): ")
    val entrada = readln()

    val nombre: String? = if (entrada.isEmpty()) null else entrada

    val saludo = saludarUsuario(nombre)
    println(saludo)
}