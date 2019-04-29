package net.franckbenault

data class Person(val firstName: String,
                  val lastName: String ,
                  val age : Int)

class Person2(val firstName: String,
                  val lastName: String ,
                  val age : Int)

fun main(args: Array<String>) {
    val person = Person("John", "Doe", 25)
    val person2 = Person2("John", "Doe", 25)

    println("person (data class) =$person")
    println("person2 (normal class) $person2")
}