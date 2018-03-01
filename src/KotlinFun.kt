package jmoto.tut.demo


/**
 * Tutorial Kotlin 2
 *
 * Fuente: https://www.youtube.com/watch?v=H_oGi8uuDpA
 *
 * Funciones
 */

fun main(args : Array<String>){

    //single line functions don´ need return type
    fun suma(num1: Int, num2: Int) : Int  = num1+num2

    println(" 5 + 4  = ${suma(5,4)} ")

    //single line without return value Unit

    fun digaHola(nombre: String) : Unit = println("Hola $nombre")


    digaHola("Lulu")




    println(" la suma de muchitos ${getSuma(1,2,3,4,5,6)}")


    println(" la factoria de 6 es  ${factorial(6)} ")

    //Lists

    var list1: MutableList<Int> = mutableListOf(1,2,3,4) //mutable, puede cambiar

    val list2: List<Int> = listOf(1,2,3,4) //inmutable

    list1.add(5)

    println("get the first iten ${list1.first()}  and the last ${list1.last() }  and the second one is ${list1.get(2)}")


    list1.forEach {  }




}

/** tailrecursion **/
fun factorial(x:Int): Int {
    tailrec fun factTail(y:Int, z:Int): Int{
        if(y==0) return z
        else return factTail(y-1,y*z)
    }
    return factTail(x,1)
}

/** varargs **/
fun getSuma(vararg nums: Int): Int{
    var sum = 0

    nums.forEach { n -> sum += n }
    return sum
}