// Task 8.3: weather station temperature analysis program

fun main() {
    // Add code here to:
    //   - Fetch data
    //   - Find records with lowest and and highest temperatures
    //   - Compute average temperature
    //   - Display all of these statistics

val data = fetchData()

    val lowest = data.minByOrNull { it.second }!!
    val highest = data.maxByOrNull { it.second }!!

    val average = data.map { it.second }.average()

    println("Lowest temperature: ${lowest.first} ${lowest.second}")
    println("Highest temperature: ${highest.first} ${highest.second}")
    println("Average temperature: $average")




}
