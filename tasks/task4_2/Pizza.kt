fun main() {
    println("Pizza Menu:")
    println("a) Margherita")
    println("b) Pepperoni")
    println("c) Hawaiian")
    println("d) Veggie")
    println("Enter your choice a, b, c, d: ")
    val input = readln().lowercase()



    val valid = if (input.length == 1 && input[0] in 'a'..'d') true else false
    if (valid) {
        println("Order accepted. preparing pizza...")
    } else {
        println("Invalid choice!")
    }
}
