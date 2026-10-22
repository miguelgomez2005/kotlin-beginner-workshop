package ejercicio05
fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) return false
    }
    return true
}

fun factorial(number: Int): Long {
    var resultado = 1L
    for (i in 1..number) {
        resultado *= i
    }
    return resultado
}

fun isEven(number: Int): Boolean = number % 2 == 0

fun main() {
    println("=== Ejercicio 5: Funciones Matemáticas ===")
    print("Ingrese un número entero no negativo: ")
    val numero = readln().toIntOrNull() ?: 0

    println("\n--- Resultados ---")
    println("¿Es $numero primo? ${isPrime(numero)}")
    println("Factorial de $numero: ${factorial(numero)}")
    println("¿Es $numero par? ${isEven(numero)}")
}