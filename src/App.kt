/* Creado por Andres Ocampo */

fun main(args: Array<String>) {

    //Fase de introduccion 1
    //println("Hola mundiooo..");


    //Declaracion de variables
    //int a = 1; -> Java
    //la palabra reservada "var" es para valores mutables
    //la palabra reservada "val" es para valores inmutables = let de swift
    /*var nombreUno = "Andres"
    var nombreDos = "Felipe"
    var apellidoUno = "Ocampo"
    var apellidoDos = "El jaiek"

    var verdad = true
    var falso = false

    var entero = 35
    var double = 0.0
    var float = 0.0

    entero += 67

    var sumatoria : Int
    sumatoria = entero + double.toInt()


    //print(sumatoria.toString())

    var nombreCompleto = nombreUno + " " + nombreDos + " " + apellidoUno + " " + apellidoDos

    //print(sumatoria.toString() + " Años tiene"  + "\n"  + nombreCompleto)
    print("Mi nombre es $nombreUno y mu segundo nombre es $nombreDos y mi apellido es $apellidoUno y me segundo apellido es $apellidoDos")*/

    val uno = 6
    val dos = 4

    val nombre = "Andres"
    val apellido = "Felipe"

    //print(suma(uno,dos))

    val resultadoUno = sumaOpcionDos(uno, dos)

    //implementacion de la funcion con parametros nombrados / namedArguments
    var resultadoDos = sumaNombres(nombreUno = nombre,nombreDos = apellido)
    var resultadosSumatorio = max(valorUno = uno,  valorDos = dos)

    //valorJusto(valor = -1)

    //print("El valor $resultadoWhen es la cifra maxima del calculo matematico realizado por $nombre $apellido")



    //Fase Array
    var stringOfString = arrayOf(nombre,apellido, "Ocampo", "Eljaiek")
    var arrayOfInt = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var arrayBoolenas = booleanArrayOf(true, false, true)

    //print(stringOfString.get(index = 0))
    //print(arrayOfInt.get(index = 5))
    //print(arrayBoolenas.get(index = 2))

    //Fase Ciclos
    for (c_valor in stringOfString.indices){
        //print(c_valor.toString() + "\n")
        print("El elemento $c_valor es ${stringOfString[c_valor]}" + "\n")
    }

    for ((c_key, c_valor) in stringOfString.withIndex()){
        //print(c_valor.toString() + "\n")
        print("El elemento $c_key es $c_valor" + "\n\n")
    }

    for (c_valor in arrayOfInt){
        print(c_valor.toString() + "\n")
    }

    for (c_valor in arrayBoolenas){
        print(c_valor.toString() + "\n")
    }

}

//funciones Opcion 1
fun suma(uno : Int, dos: Int) : Int{
    return uno + dos
}

//Funciones Opcion 2
fun sumaOpcionDos(unoA : Int, dosA : Int): Int = unoA + dosA

//
fun sumaNombres(nombreUno : String, nombreDos : String) : String{
    return nombreUno + " " + nombreDos
}


/// Funcion de calculo maximo de dos valores para
/// comprobar que valor es mas grande que otro
///
fun max(valorUno : Int, valorDos : Int): Int{

    if (valorUno > valorDos){
        return  valorUno
    } else{
        return  valorDos
    }
}


fun valorJusto(valor : Int){

    //Este el el Switch en Kotlin dentro del parentesis se coloca la valor que se quiere evaluar
    when(valor){
        5 -> print("Es el precio exacto")
        //10 -> print("'10' es demasiado")
        //Rango in "valor..valor"
        //!in 6..25 -> print("Es demasido") -> esto se puede negar y asi poder comprobar otros valores que no esten dentro de nuestro rango
        in 6..25 -> print("Es demasido")
        in 25..30 -> print("No lo compres !!!")
        else -> print("no reconozco ese precio")
    }
}








