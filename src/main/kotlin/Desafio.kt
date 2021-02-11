import java.util.*

const val soma = "+"
const val subtracao = "-"
const val  divisao = "/"
const val  multiplicacao = "*"

fun main() {

    var n1:Float = 5f
    var n2:Float = 10f
    var operacao:String = "-"

    var result = when{
        operacao == soma -> {n1 + n2}
        operacao == subtracao -> {n1 - n2}
        operacao == divisao -> {n1/n2}
        operacao == multiplicacao ->{n1*n2}
        else ->{
            "OPERAÇÃO INVALIDA!"
        }
    }

    println(result)
}