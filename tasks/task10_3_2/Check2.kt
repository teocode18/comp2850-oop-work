// Task 10.3.2: program in which null values can occur

fun printReversed(text: String?) {
    when (text) {
        null -> println("Result: null")
        else -> println("Result: ${text.reversed().uppercase()}")
    }
}

fun main(args: Array<String>) {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    printReversed(input)
}
