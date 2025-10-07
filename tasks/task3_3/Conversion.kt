// Task 3.3: conversion of strings to numbers

fun main() {

print("Please enter your age: ")
val age = readln().toInt()
println(age)

}


// for 19.5 we get Please enter your age: 19.5
//ception in thread "main" java.lang.NumberFormatException: For input string: "19.5"
     // at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
      //at java.base/java.lang.Integer.parseInt(Integer.java:662)
      //at java.base/java.lang.Integer.parseInt(Integer.java:778)
       //t ConversionKt.main(Conversion.kt:6)
      //at ConversionKt.main(Conversion.kt)


// for nineteen we get Please enter your age: nineteen 
//ception in thread "main" java.lang.NumberFormatException: For input string: "nineteen"
   //   at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
      //at java.base/java.lang.Integer.parseInt(Integer.java:662)
     // at java.base/java.lang.Integer.parseInt(Integer.java:778)
      //at ConversionKt.main(Conversion.kt:6)
      //at ConversionKt.main(Conversion.kt)

      // for 3147203180 we get
     //lease enter your age: 3147203180
//ception in thread "main" java.lang.NumberFormatException: For input string: "3147203180"
    //  at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
      //at java.base/java.lang.Integer.parseInt(Integer.java:662)
      //at java.base/java.lang.Integer.parseInt(Integer.java:778)
       //t ConversionKt.main(Conversion.kt:6)
       //t ConversionKt.main(Conversion.kt)


       //3147203180 is greater than the maximum allowed for Int, so if you try to read or assign this value to an Int, you will get an error



       // i am now conse ouput as of 07/10/2025