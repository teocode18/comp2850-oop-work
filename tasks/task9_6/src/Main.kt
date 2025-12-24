// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("Error: no filename provided")
        exitProcess(1)
    }

    val filename = args[0]

    try {
        val data = readData(filename)
        val v = variance(data)

        println("Dataset size: ${data.size}")
        println("Variance: %.5f".format(v))

    } catch (e: Exception) {
        println("Error: ${e.message}")
        exitProcess(1)
    }
}
