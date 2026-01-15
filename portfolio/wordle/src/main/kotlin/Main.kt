// This file contains the game loop

private const val MAX_ATTEMPTS = 10

fun main() {
    val words = readWordList("data/words.txt")
    val target = pickRandomWord(words)

    for (attempt in 1..MAX_ATTEMPTS) {
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, target)
        displayGuess(guess, matches)

        if (matches.all { it == 1 }) {
            println("Well done! You guessed the word in $attempt attempt(s).")
            return
        }
    }

    println("Unlucky! You ran out of guesses. The word was \"$target\".")
}
