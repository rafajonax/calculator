const val ADDITION = 1
const val SUBTRACTION = 2
const val MULTIPLICATION = 3
const val DIVISION = 4


fun main() {
    println("Digite o primeiro número")
    val number1: Float? = readLine()?.toFloatOrNull()
    println("Digite o segundo número")
    val number2: Float? = readLine()?.toFloatOrNull()
    println("Digite a ação")
    val action: Int? = readLine()?.toIntOrNull()

    println(calculator(number1, number2, action))
}

fun calculator(n1: Float?, n2: Float?, action: Int?): String {
    return  if(n1 == null || n2 == null)
        "Erro! Valores nulos não são aceitos."
    else {
        when(action) {
            ADDITION -> addiction(n1, n2)
            SUBTRACTION -> subtraction(n1, n2)
            MULTIPLICATION -> multiplication(n1, n2)
            DIVISION -> division(n1, n2)
            else -> "Operação inválida"
        }.toString()
    }
}

fun addiction(n1: Float, n2: Float) = n1 + n2

fun subtraction(n1: Float, n2: Float) = n1 - n2

fun multiplication(n1: Float, n2: Float) = n1 * n2

fun division(n1: Float, n2: Float) = n1 / n2 //test division by 0