import java.io.File
import kotlin.random.Random
// Implement the six required functions here

fun isValid(word: String): Boolean {
    return word.length == 5
}

fun readWordList(filename: String): MutableList<String> {
    return File(filename).readLines().toMutableList()
}

fun pickRandomWord(words: MutableList<String>): String {
    val index = Random.nextInt(words.size)
    return words.removeAt(index) }


fun obtainGuess(attempt: Int): String {
    while (true) {
        print("Attempt $attempt: ")
        val guess = readln()
        if (isValid(guess)) return guess
        println("Invalid guess. Please enter a 5-letter word.")
    }
}

fun evaluateGuess(guess: String, target: String): List<Int> {
    return guess.mapIndexed { index, c ->
        if (c == target[index]) 1 else 0
    }
}


fun displayGuess(guess: String, matches: List<Int>) {
    for (i in guess.indices) {
        if (matches[i] == 1) print(guess[i])
        else print("?")
    }
    println()
}



