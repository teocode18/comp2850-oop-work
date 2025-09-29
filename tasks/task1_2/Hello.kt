fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println(greetingFor(args[0]))
    }
    else {
        println(greetingFor("World"))
    }
}

// if there are no command line arguments, it will greet "World"
// otherwise it will greet the first argument and it will be randomly chosen from a set of greetings such as "Hello", "Hi" or "G'day"