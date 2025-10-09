import kotlin.math.roundToInt

fun main(args: Array<String>) 
{
    if (args.size < 1) {
        println("Error,One command line argument required.")
        return
    }
    if (lettergrade < 0.0 || lettergrade > 100.0) {
        println("Error,Invalid grade.")
        return
    }
    val letterGrade = when {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }
    println("Letter grade: $letterGrade")
}