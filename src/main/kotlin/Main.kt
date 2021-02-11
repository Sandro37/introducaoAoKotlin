// valor imutável
const val a = 1.0

fun main(args: Array<String>) {
    println("Olá mundo")
    println("aqui quem é o macarrão")

    // valor mutável
    var i = 0
    println(i)
    i = 100
    println(i)


    // valor imutável
    val j = 0
    println(j)
    var nome = "alessandro"
    println(nome)

    var ano = "alessandro"

    // convertendo
    ano = 2021.toString() + " vai ser melhor"

    println(ano)

    var month: Int? = null
    println(month)
    month = 50

    ///operação aritmética comandos
    println("COMANDOS ARITMÉTICOS\n")
    println(month.minus(2)) // a - b
    println(month.plus(2)) // a + b
    println(month.times(2)) // a * b
    println(month.div(2)) // a / b


    println("________________________")
    var num = 5
    if (num.compareTo(5) == 0) {
        println("Igual")
    }


    // retorna 1 se for maior
    // retorna 0 se for igual
    // retorna -1 se for menor
    println("________________________")
    println(num.compareTo(4)) // retornar 1
    println(num.compareTo(5)) // retornar 0
    println(num.compareTo(6)) // retornar -1

    println(num.equals(5)) // true ou false
    println(num.equals(4)) // true ou false

    println("________________________")
    while (num < 10) {
        if (num % 2 == 0) {
            println("PAR = " + num)
        }
        num++
    }

    // operadores in  e range
    println("________________________")
    val numbers = listOf(3, 9, 0, 1, 2)
    println(12 in numbers)
    println(12 !in numbers)
    println(12 in 0..20)

    // sorteia num número
    var numSort = (1..20).random()
    println(numSort in numbers)

    var idade = 18

    if (idade in 12..18) {
        println("Entre 12 e 18")
    }

    if ((idade >= 12) && (idade <= 18)) {
        println("Entre 12 e 18")
    }


    //STRINGS
    println("____STRINGS_____")
    var arrayNome = "alessandro"
    println("Seja bem vindo, " + arrayNome)
    println("Seja bem vindo, ${arrayNome}, sua idade é ${idade}")
    println("Seja bem vindo, ${arrayNome.capitalize()}") // deixa o primeiro caracter maiusculo

    // Empty x blank
    println("____________________________________")
    var s = ""
    println(s.isNullOrEmpty())
    println(s.isEmpty())
    s = "    "
    println(s.isEmpty())
    println(s.isBlank())

    println("_________FUNÇÕES_______________")
    println(soma(5, 5))
    println("NOME = ${getFullName("Alessandro", "Silva")}")
    println("NOME = ${getFullName2("Alessadro", "Silva")}")
    println("NOME = ${getFullName3("Alessandro", "Silva")}")

    //Funções de ordem  superior
    println("____Funções de ordem superior______")
    val x = calculate(12, 4, ::sum)
    val y = calculate(12, 4,) { a, b -> a * b }
    println(x)
    println(y)

    println("______-")
    var a = "alessandro"
    println(a.randomCapitalizedLetter())

    //estruturas de controle
    println("________________")
    var numSort2 = (1..5).random()

    if (numSort2 == 0) {
        println("0")
    } else if (numSort2 == 1) {
        println("1")
    } else if (numSort2 == 2){
        println("2")
    }else if(numSort2 == 3){
        println("3")
    }else if(numSort2 == 4) {
        println("4")
    }else{
        println("5")
    }

    var number1 = (0..4).random()
    var number2 = (0..4).random()
    val maxValue = if (number1 > number2) number1 else if (number1 < number2) number2 else number2

    val minValue = if(number1 > number2){
        number2
    }else if (number1 < number2){
        number1
    }else{
        number2
    }
    println("MAXVALUE = ${maxValue}")
    println("MINVALUE = ${minValue}")
    var c = (0..3).random()
    when{
        number1 > number2 ->{ println("Maior que number 2")}
        number1 != number2 && number1 > c ->{ println("Difente de number 2 e maior que C")}
        number2 == 0 ->{ println("number 2 igual a 0")}
        else ->{ println("Nenhuma alternativa")}
    }

    var year:Int = 2020

    when(year) {
        in -4000..475 -> {
        }
        in 476..1475 -> {
        }
        in 1453..1789 -> {
        }
        else -> {
        }
    }
    i = 0

    println("________FORs_____________")
    for (numIterator in 0..5){
        println(numIterator) // do 0 ao 5
    }
    println("_______________________")
    for (numIterator in 0..5 step 2){
        println(numIterator) // do 0 ao 5 incrementando de 2 em 2
    }
    println("_______________________")
    for(numIterator in 10 downTo 0){
        println(numIterator) // do 10 ao 0
    }
    println("_______________________")
    for(numIterator in 0 until 10){
        println(numIterator) // do 0 ao 10-1
    }
    println("_______________________")
    var text = "Kotlin"

    for(letter in text){
        println(letter)
    }
}
// funções
fun soma(n1:Int, n2:Int):Int{
    return n1 + n2;
}

private fun getFullName(name:String, lastName:String):String{
    val fullName = "$name $lastName"
    return  fullName
}

private fun getFullName2(name:String, lastName: String):String{
    return  "$name $lastName"
}

// funções single_line
private fun getFullName3(name: String, lastName: String) = "$name $lastName"


fun String.randomCapitalizedLetter() = this[(0..this.length - 1).random()].toUpperCase()
// função de ordem superior
fun sum(a1:Int, a2:Int) = a1.plus(a2)

fun calculate(n1:Int, n2:Int, operation:(Int,Int)->Int):Int{
    val result = operation(n1, n2)
    return result
}