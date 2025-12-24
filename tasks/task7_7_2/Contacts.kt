fun main() {
    val contacts = mutableMapOf<String, String>()

    while (true) {
        print("Enter contact name (or press Enter to quit): ")
        val name = readln()

        if (name.isBlank()) break

        if (name in contacts) {
            println("Phone number: ${contacts[name]}")
        } else {
            print("Enter phone number for $name: ")
            val number = readln()
            contacts[name] = number
            println("Contact saved.")
        }
    }
}
// Task 7.7.2: contact database, using a map
