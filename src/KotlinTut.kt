package jmoto.tut.demo

import java.math.BigInteger

/**
 * Tutorial Kotlin 1
 *
 * Fuente: https://www.youtube.com/watch?v=H_oGi8uuDpA
 *
 * 1. crear clase, paquete, no es necesario crear la estructura del archivos, carpetas
 * 2. fun - funciones
 * 3. val - inmutable
 * 4. var - mutable
 * 5. inferencia, ejemplo name es string, age es int
 * 6. Print con  +  o con $ interpolation
 */
fun main(args: Array<String>){
    println("Hola Inmundo")

    /* inmutable - no cambia el valor */
    val name = "Jaimoto"

    /* cambia el valor */
    var age = 8

    /* define data types  - int*/
    var bigMotoInt: Int = Int.MAX_VALUE
    var smallMotoInt: Int = Int.MIN_VALUE

    println("Max int " + bigMotoInt)
    /* string interpolation */
    println("Min int  $smallMotoInt")


    var bigMotoLong : Long = Long.MAX_VALUE
    var smallMotoLong : Long = Long.MIN_VALUE
    println("Max long $bigMotoLong ")
    println("Min long  $smallMotoLong")

    var bigMotoShort : Short = Short.MAX_VALUE
    var smallMotoShort : Short = Short.MIN_VALUE
    println("Max long $bigMotoShort ")
    println("Min long  $smallMotoShort")


    /* Lost of precision - after 15 char */
    var dbNum1 : Double = 1.111111111111111111
    var dbNum2 : Double = 1.111111111111111111
    println("valor 1 $dbNum1")
    println("valor 2 $dbNum2")
    println("sum  1+2 = " + (dbNum1+dbNum2))
    println("sum  1+2 = ($dbNum1+$dbNum2)" )

    /* Validate object type */
    var boleano: Boolean = true and false

    if(boleano is Boolean)
        println("boleano es boleano y el valor es $boleano")

    /* Caracteres - Validacion  */
    var caracter : Char = 'a'
    println(" A es un Char : ${caracter is Char} " )

    /*Casting*/
    println("3.14 to int ${3.14.toInt()}")
    println("Char to intenger " + (caracter.toInt()))

    /*Array Demos*/
    var miArreglo = arrayOf(1,1.23,"Moto")

    println(miArreglo[2])

    miArreglo[1] = 3.13

    println(miArreglo)

    println(miArreglo[1])

    var arreglito = miArreglo.copyOfRange(1,3)

    println("Longitud subarreglo ${arreglito.size} ")

    /**Arreglos con funciones */
    var cuadrado = Array(5, {x -> x * x})

    println(cuadrado[2])


    /**Arranges**/
    val oneTo10 = 1..10
    val alplha = "A".."Z"
    println("   Indice de J ${alplha.contains("J")} ")
    for (x in oneTo10) println(" range  $x")
    //No sirvio para for (x in alplha) println(" range  $x")


    /** when! **/
    when(age){
        0,1,2,3,4 -> println("Go to Jardin")

        5 -> println("Go to Kinder")

        in 6..17 -> {
            val grade = age -5
            println("Go to curso $grade")
        }
        else -> println("Go to Uni")
    }

    /** for **/
    for(x in 1..20){
        if(x%2 ==0)
            continue //evalua el siguiente elemento

        println("impar $x")

        if (x== 15) break //break normal
    }

}

