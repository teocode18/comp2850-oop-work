import java.io.File

// Task 9.6: functions for dataset variance calculation

// Add variance() function here

// Add readData() function here

fun variance(dataset: List<Double>): Double {
    require(dataset.size > 1) { "not enough data" }

    val mean = dataset.average()
    val sumSq = dataset.sumOf { (it - mean) * (it - mean) }

    return sumSq / (dataset.size - 1)   // <-- key change (sample variance)
}

fun readData(filename: String) = buildList {
    File(filename).forEachLine {
        add(it.toDouble())
    }
}
