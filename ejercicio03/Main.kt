package ejercicio03
fun main() {
    println("=== Ejercicio 3: Tabla de Multiplicar ===")
    print("Ingrese un número entero: ")
    val numero = readln().toIntOrNull() ?: 1

    var suma = 0
    println("\nTabla de multiplicar del $numero:")
    for (i in 1..10) {
        val resultado = numero * i
        println("$numero x $i = $resultado")
        suma += resultado
    }

    println("Suma total de los resultados: $suma")
}