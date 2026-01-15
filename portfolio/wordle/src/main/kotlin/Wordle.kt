import java.io.File
import kotlin.random.Random

private const val WORD_LENGTH = 5

// Checks whether a word is valid by ensuring it has exactly 5 alphabetic letters
fun isValid(word: String): Boolean { // unit test completed
    return word.length == WORD_LENGTH && word.all { it.isLetter() }
}

// Reads all lines from the given file and returns them as a mutable list of strings
fun readWordList(filename: String): MutableList<String> = // unit test completed
    File(filename).readLines().toMutableList()

// Selects a random word from the list, removes it, and returns it
fun pickRandomWord(words: MutableList<String>): String { // unit test completed
    val index = Random.nextInt(words.size)
    return words.removeAt(index)
}

// Prompts the user to enter a valid guess until a correct 5-letter word is provided
fun obtainGuess(attempt: Int): String { // unit test not required
    while (true) {
        print("Attempt $attempt: ")
        val guess = readln()
        if (isValid(guess)) return guess
        println("Invalid guess. Please enter a 5-letter word.")
    }
}

// Compares the guess with the target and returns 1 for correct letters in the correct position
fun evaluateGuess(guess: String, target: String): List<Int> { // unit test completed
    return guess.mapIndexed { index, c ->
        if (c == target[index]) 1 else 0
    }
}

// Displays matching letters from the guess and '?' for non-matching positions
fun displayGuess(guess: String, matches: List<Int>) { // unit test not required
    for (i in guess.indices) {
        if (matches[i] == 1) {
            print(guess[i])
        } else {
            print("?")
        }
    }
    println()
}
