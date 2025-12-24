fun printReversed(text: String?) = {
    println("Result: ${text?.let { it.reversed().uppercase() }}")
}

fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    when (input) {
        null -> println("Result: null")
        else -> printReversed(input)
}

   
}