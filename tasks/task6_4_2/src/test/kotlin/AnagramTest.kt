// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({

    "Strings of different lengths are not anagrams" {
        withClue("Different lengths should return false") {
            ("abc" anagramOf "ab") shouldBe false
        }
    }

    "Empty string is not an anagram of itself" {
        withClue("Spec says empty string is not an anagram of itself") {
            ("" anagramOf "") shouldBe false
        }
    }

    "Non-empty string is an anagram of itself" {
        withClue("A non-empty string should be an anagram of itself") {
            ("abc" anagramOf "abc") shouldBe true
        }
    }

    "Same characters in a different order are anagrams" {
        withClue("Same letters, different order should return true") {
            ("listen" anagramOf "silent") shouldBe true
        }
    }

    "Letter case is disregarded" {
        withClue("Case should be ignored") {
            ("Listen" anagramOf "Silent") shouldBe true
        }
    }
})
