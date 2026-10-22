package ejercicio02
fun main() {
    println("=== Ejercicio 2: Clasificación de Estudiantes ===")
    print("Ingrese el nombre del estudiante: ")
    val nombre = readln()

    print("Ingrese la calificación 1 (0.0 a 5.0): ")
    val nota1 = readln().toDoubleOrNull() ?: 0.0

    print("Ingrese la calificación 2 (0.0 a 5.0): ")
    val nota2 = readln().toDoubleOrNull() ?: 0.0

    print("Ingrese la calificación 3 (0.0 a 5.0): ")
    val nota3 = readln().toDoubleOrNull() ?: 0.0

    val promedio = (nota1 + nota2 + nota3) / 3.0

    println("\n--- Resultado ---")
    println("Estudiante: $nombre")
    println("Promedio: %.2f".format(promedio))

    if (promedio >= 3.0) {
        println("Estado: Aprobado")
        if (promedio >= 4.5) {
            println("¡Promedio excelente!")
        }
    } else {
        println("Estado: Reprobado")
    }
}