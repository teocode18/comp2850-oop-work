
fun main() {
    var number = 42   // changed to var to allow reassignment, with val the error message is "Val cannot be reassigned"

    println(number)
    number = 50
    println(number)
}


// kotlinc number.kt to complie
// kotlin NumberKt to run