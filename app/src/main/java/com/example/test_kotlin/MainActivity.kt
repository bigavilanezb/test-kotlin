package com.example.test_kotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

        // Lección 1
        //variablesYConstantes()

        // Lección 2
        // tipoDeDatos()

        // Lección 3
        // sentenciaIf()

        // Lección 4
        // sentenciaWhen()

        // Lección 5
        // arrays()

        // Lección 6
        // maps()

        // Lección 7
        // loops()

        // Lección 8
        // nullSafety()

        // Lección 9
        // funciones()

        // Lección 10
        classes()
    }

    /*
    Aquí vamos a hablar de variables y constantes
    */
    private fun variablesYConstantes() {

        // Variables

        var myFirstVariable = "Hello Hackermen!"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Bienvenidos a GaBa"

        println(myFirstVariable)

        // No podemos asignar un valor de tipo Int a una variable de valor de tipo String
        // myFirstVariable = 1

        var mySecondVariable = "Suscríbete!"

        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "¿Ya te has suscrito?"

        println(myFirstVariable)

        // Constante

        val myFirstConstant = "¿Te ha gustado el tutorial?"

        println(myFirstConstant)

        // Una constante no puede modificar su valor
        // myFirstConstant = "Si te ha gustado, dale a LIKE"

        val mySecondConstant = myFirstVariable

        println(mySecondConstant)
    }

    /*
    Aquí vamos a hablar de tipos de datos (data types)
    */
    private fun tipoDeDatos() {

        // String

        val myString: String = "Hola hackerman!"
        val myString2 = "Bienvenidos a GaBa"
        val myString3: String = myString + " " + myString2

        println(myString3)

        // Enteros (Byte, Short, Int, Long)

        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 // En realidad este es Int
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (bool)

        val myBool: Boolean = true
        val myBool2 = false
        // val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)

    }
    /*
    Aquí vamos a hablar de la sentencia if
    */
    private fun sentenciaIf() {

        val myNumber = 71

        // Operadores condicionales
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igualdad
        // != desigualdad

        // Operadores lógicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"

        if ( !(myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            // Sentencia if
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")
        } else if (myNumber == 60) {
            println("$myNumber es igual a 60")
        } else if (myNumber != 70){
            println("$myNumber no es igual a 70")
        } else {
            // Sentencia else
            println("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }


    }
    /*
    * Aqui vamos a hablar de la sentencia When*/
    private fun sentenciaWhen() {

        // When con String
        val country = "Italiano"

        when(country) {
            "España", "Mexico", "Perú", "Colombia", "Argentina" -> {
                println("El idioma es Español")
            } "EEUU" -> {
                println("El idioma es Inglés")
            } "Francia" -> {
                println("El idioma es Francés")
            } else -> {
                println("No conocemos el idioma")
            }
        }

        // When con Int
        val age = 100

        when(age) {
            0, 1, 2 -> {
                println("Eres un bebé")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11..17 -> {
                println("Eres un adolescente")
            } in 18..69 -> {
                println("Eres un adulto")
            } in 70..99 -> {
                println("Eres un anciano")
            } else -> {
                println("\uD83D\uDE07")
            }
        }

    }

    /*
    * Aqui vamos a hablar de arrays o arreglos*/

    private fun arrays() {

        val name = "Bryan"
        val surname = "Gavilanez"
        val company = "GaBa"
        val age = "25"

        // Creación de un array

        val myArray = arrayListOf<String>()

        // Añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        // Añadir un conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))

        println(myArray)

        // Acesso a datos

        val myCompany = myArray[2]

        println(myCompany)

        // Modificación de datos

        myArray[5] = "Suscribete y activa la campana"

        println(myArray)

        // Eliminar datos

        myArray.removeAt(4)

        println(myArray)

        //  Recorrer datos

        myArray.forEach {
            println(it)
        }

        // Otras operaciones

        println(myArray.count())

        myArray.clear()

        println(myArray.count())

        myArray.first()
        myArray.last()

        myArray.sort()

    }

    /*
    * Aqui vamos a hablar de mapas, también llamados diccionarios*/

    private fun maps() {

        // Sintaxis
        var myMap: Map<String, Int> = mapOf()
        println(myMap)

        // Añadir elementos
        myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
        println(myMap)

        // Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria", 8)
        println(myMap)

        // Actualización de un dato
        myMap.put("Brais", 3)
        myMap["Brais"] = 4
        println(myMap)

        myMap.put("Marcos", 3)
        println(myMap)

        // Acceder a un dato
        println(myMap["Brais"])

        // Eliminar un dato

        myMap.remove("Brais")
        println(myMap)
    }

    /*
    Aquí vamos a hablar de loops, también llamados bucles
    */

    private fun loops() {

        // Bucles

        val myArray = listOf("Hola", "Bienvenidos al tutorial", "Suscribete")
        val myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)

        // For

        for (myString in myArray) {
            println(myString)
        }

        for (myElement in myMap) {
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10) {
            println(x)
        }

        for (x in 0 until 10) {
            println(x)
        }

        for (x in 9 until 30) {
            println(x)
        }

        for (x in 0..10 step 2) {
            println(x)
        }

        for (x in 10 downTo 0 step 3) {
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNum in myNumericArray) {
            println(myNum)
        }

        // While

        var x = 0

        while ( x < 10) {
            println(x)
            x++
        }
    }

    /*
    * Aqui vamos a hablar de seguridad contra nulos (Null Safety)*/

    fun nullSafety() {

        var myString = "MoureDev"
        // myString = null Esto daría un error de compilación
        println(myString)

        // Variable null safety
        var mySafetyString: String? = "Bryan null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Suscribete!"
        // println(mySafetyString)

        /*if (mySafetyString != null) {
            println(mySafetyString!!)
        } else {
            println(mySafetyString)
        }*/

        // Safe call

        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run {
            println(mySafetyString)
        }

    }
    /*
    Aquí vamos a hablar de funciones
    */
    fun funciones() {

        sayHello()
        sayHello()
        sayHello()

        sayMyName("Bryan")
        sayMyName("Pedro")
        sayMyName("Sara")

        sayMyNameAndAge("Bryan", 25)
        sayMyNameAndAge("Pedro", 33)
        sayMyNameAndAge("Sara", 22)

        val sumResult = sumTwoNumbers(44, 33)
        println(sumResult)

        println(sumTwoNumbers(11, 23))

        println(sumTwoNumbers(33, sumTwoNumbers(12, 11)))
    }

    // Función simple
    fun sayHello() {
        println("Hola!")
    }

    // Funciones con un parámetro de entrada
    fun sayMyName(name: String) {
        println("Hola, mi nombre es $name")
    }

    // Funciones con un parámetro de entrada
    fun sayMyNameAndAge(name: String, age: Int) {
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    // Funciones con un valor de retorno
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int {
        val sum = firstNumber + secondNumber
        return sum
    }

    /*
    Aquí vamos a hablar de clases
    */
    fun classes() {

        val bryan = Programmer("Bryan", 25, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))
        println(bryan.name)

        bryan.age = 40
        bryan.code()

        val sara = Programmer("Sara", 35, arrayOf(Programmer.Language.JAVA), arrayOf(bryan))
        sara.code()

        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")
    }
}