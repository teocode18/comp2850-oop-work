// Task 7.7.1: stats for a numeric dataset

fun readData(): List<Double> = buildList {
    println("Enter floating-point values (press Enter on an empty line to finish):")

    while (true) {
        val line = readln()
        if (line.isBlank()) break

        val value = line.toDoubleOrNull()
        if (value != null) {
            add(value)
        } else {
            println("Invalid number, please try again.")
        }
    }
}

fun median(data: List<Double>): Double {
    if (data.isEmpty()) throw IllegalArgumentException("Data list is empty")
    val sortedData = data.sorted()
    val size = sortedData.size
    return if (size % 2 == 1) {
        sortedData[size / 2]
    } else {
        (sortedData[size / 2 - 1] + sortedData[size / 2]) / 2
    }
}

fun displayStats(data: List<Double>) {
    println("Count: ${data.size}")
    println("Minimum: ${data.minOrNull()}")
    println("Maximum: ${data.maxOrNull()}")
    println("Mean: ${data.average()}")
    println("Median: ${median(data)}")
}

fun main() {
    val data = readData()
    displayStats(data)
}
