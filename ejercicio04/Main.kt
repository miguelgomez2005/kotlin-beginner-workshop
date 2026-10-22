package ejercicio04
fun main() {
    println("=== Ejercicio 4: Análisis de una Lista ===")
    val numeros = mutableListOf<Int>()

    for (i in 1..10) {
        print("Ingrese el número $i de 10: ")
        val n = readln().toIntOrNull() ?: 0
        numeros.add(n)
    }

    println("\n--- Análisis ---")
    println("Elementos de la lista: $numeros")

    val suma = numeros.sum()
    val promedio = suma.toDouble() / numeros.size
    val mayor = numeros.maxOrNull()
    val menor = numeros.minOrNull()

    var pares = 0
    var impares = 0

    for (n in numeros) {
        if (n % 2 == 0) pares++ else impares++
    }

    println("Suma: $suma")
    println("Promedio: $promedio")
    println("Número mayor: $mayor")
    println("Número menor: $menor")
    println("Cantidad de pares: $pares")
    println("Cantidad de impares: $impares")
}