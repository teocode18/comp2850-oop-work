fun
main() {    

print("Enter your name: ")
val name = readln()
println(name.length)

}


// it prints the lenghth of the name entered
// if its empty it prints 0 


// Enter your name: Exception in thread "main" kotlin.io.ReadAfterEOFException: EOF has already been reached
 //     at kotlin.io.ConsoleKt.readln(Console.kt:152)
  //    at NameKt.main(Name.kt:5)
   //   at NameKt.main(Name.kt)
   // this occurs wen ctrl d is pressed without entering any name 