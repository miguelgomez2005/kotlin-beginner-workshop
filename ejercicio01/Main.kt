package ejercicio01
fun main() {
    println("=== Ejercicio 1: Calculadora Básica ===")
    print("Ingrese el primer número: ")
    val num1 = readln().toDoubleOrNull() ?: 0.0

    print("Ingrese la operación (+, -, *, /): ")
    val operacion = readln().trim().firstOrNull() ?: '+'

    print("Ingrese el segundo número: ")
    val num2 = readln().toDoubleOrNull() ?: 0.0

    val resultado = when (operacion) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0.0) num1 / num2 else "Error: División entre cero"
        else -> "Operación no válida"
    }

    println("Resultado: $resultado")
}