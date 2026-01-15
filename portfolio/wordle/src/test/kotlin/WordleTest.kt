// This file contains unit tests (Kotest)
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({

    // Tests that isValid returns true only for strings that are exactly 5 alphabetic letters
    "isValid returns true only for 5-letter alphabetic words" {
        withClue("Valid inputs: exactly 5 letters") {
            isValid("apple") shouldBe true
            isValid("APPLE") shouldBe true
            isValid("ApPlE") shouldBe true
        }

        withClue("Invalid inputs: wrong length or non-letter characters") {
            isValid("appl") shouldBe false
            isValid("apples") shouldBe false
            isValid("appl3") shouldBe false
            isValid("appl&") shouldBe false
        }
    }

    // Tests that readWordList successfully reads the words file
    "readWordList reads words from data/words.txt" {
        val words = readWordList("data/words.txt")
        withClue("The word list should not be empty") {
            words.isNotEmpty() shouldBe true
        }
    }

    // Tests that pickRandomWord removes one word from the list and returns it
    "pickRandomWord returns a word and removes it from the list" {
        val list = mutableListOf("apple", "grape", "berry")
        val before = list.size
        val chosen = pickRandomWord(list)

        withClue("List size should decrease by 1") {
            list.size shouldBe before - 1
        }

        withClue("The chosen word should no longer be in the list") {
            list.contains(chosen) shouldBe false
        }
    }

    // Tests that evaluateGuess returns all 1s when guess and target are identical
    "evaluateGuess returns 1 for matching letters in the same position" {
        val guess = "berry"
        val target = "berry"
        val result = evaluateGuess(guess, target)

        withClue("All letters match in the correct position") {
            result shouldBe listOf(1, 1, 1, 1, 1)
        }
    }

    // Tests that evaluateGuess returns all 0s when no letters match by position
    "evaluateGuess returns 0 when letters do not match in position" {
        val guess = "berry"
        val target = "zzzzz"
        val result = evaluateGuess(guess, target)

        withClue("No letters match the target in the same position") {
            result shouldBe listOf(0, 0, 0, 0, 0)
        }
    }
})
