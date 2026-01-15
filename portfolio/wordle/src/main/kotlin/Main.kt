// This file contains the game loop

private const val MAX_ATTEMPTS = 10

fun main() {
    // Reads the list of valid words from file
    val words = readWordList("data/words.txt")

    // Selects a random target word from the list
    val target = pickRandomWord(words)

    // Repeats the guessing process up to the maximum number of attempts
    for (attempt in 1..MAX_ATTEMPTS) {
        // Obtains a valid guess from the user
        val guess = obtainGuess(attempt)

        // Compares the guess with the target word
        val matches = evaluateGuess(guess, target)

        // Displays matching letters to the user
        displayGuess(guess, matches)

        // Checks if all letters were guessed correctly
        if (matches.all { it == 1 }) {
            println("Well done! You guessed the word in $attempt attempt(s).")
            return
        }
    }

    println("Unlucky! You ran out of guesses. The word was \"$target\".")
}
