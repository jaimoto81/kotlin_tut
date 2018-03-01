/**
 * Tutorial de clases, tomado de DZone Refcard
 * https://dzone.com/storage/assets/8015745-dzone-refcard267-kotlin.pdf
 */

class Person(name: String, age: Int) {
    init {
        println("new Person $name will be born.")
    }
    var ageProp = age
    val name = name
}

//data class DataEjemplo constructor(primary){val primaryId = primary}
sealed class Secreto(name: String) //Restricts class hierarchies to a set of subtypes. Useful with when

enum class Meses

object SingleTonDemo //Used to create Singletons of a type



//FUNCTION TYPES AND LAMBDAS



fun main(args: Array<String>) {
    var jaimoto = Person("Jaimoto", 36)
    var lulu = Person(age = 1, name = "Lucia")
    val lala = Person(age = 14, name = "Laura")


    lulu.ageProp = 32;

    val myFunction: (String) -> Boolean = {
        s -> s.length > 5 }

    print( myFunction("HelloWorld"))

    print( myFunction(jaimoto.name))
    print( myFunction(lulu.name))
            print( myFunction(lala.name))


}