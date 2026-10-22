package ejercicio07
class Contact(val nombre: String, val telefono: String, val correo: String) {
    fun mostrar() {
        println("Nombre: $nombre | Teléfono: $telefono | Correo: $correo")
    }
}

fun main() {
    println("=== Ejercicio 7: Agenda de Contactos ===")
    val contactos = mutableListOf<Contact>()

    while (true) {
        println("\n--- Menú Agenda ---")
        println("1. Agregar contacto")
        println("2. Listar contactos")
        println("3. Buscar por nombre")
        println("4. Eliminar por nombre")
        println("5. Salir")
        print("Seleccione una opción: ")

        when (readln().toIntOrNull()) {
            1 -> {
                print("Ingrese nombre: ")
                val nombre = readln()
                print("Ingrese teléfono: ")
                val telefono = readln()
                print("Ingrese correo: ")
                val correo = readln()
                contactos.add(Contact(nombre, telefono, correo))
                println("¡Contacto agregado con éxito!")
            }
            2 -> {
                println("\n--- Lista de Contactos ---")
                if (contactos.isEmpty()) {
                    println("La agenda está vacía.")
                } else {
                    contactos.forEach { it.mostrar() }
                }
            }
            3 -> {
                print("Ingrese el nombre a buscar: ")
                val nombreBuscado = readln()
                val encontrado = contactos.find { it.nombre.equals(nombreBuscado, ignoreCase = true) }
                if (encontrado != null) {
                    println("Contacto encontrado:")
                    encontrado.mostrar()
                } else {
                    println("Aviso: El contacto '$nombreBuscado' no existe en la agenda.")
                }
            }
            4 -> {
                print("Ingrese el nombre a eliminar: ")
                val nombreEliminar = readln()
                val eliminado = contactos.removeIf { it.nombre.equals(nombreEliminar, ignoreCase = true) }
                if (eliminado) {
                    println("Contacto '$nombreEliminar' eliminado correctamente.")
                } else {
                    println("Aviso: No se pudo eliminar, el contacto '$nombreEliminar' no existe.")
                }
            }
            5 -> {
                println("Saliendo de la agenda...")
                break
            }
            else -> println("Opción inválida. Intente de nuevo.")
        }
    }
}