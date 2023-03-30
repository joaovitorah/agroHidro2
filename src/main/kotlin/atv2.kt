fun main () {

    var resultado = 0.0

    println("Digite o primeiro número: ")
    val n1 = readln().toDouble()

    println("Digite o operador que deseja. ex: /, *, -, +")
    val operation = readln()//"-" or "+" or "-" or "/" or "*"

    println("Digite o segundo número: ")
    val n2 = readln().toDouble()

    when(operation) {
        "/" -> {
            resultado = n1/n2
            println("O resultado da sua divisão é: "+resultado)
        }

        "*" -> {
            resultado = n1*n2
            println("O resultado da sua multiplicação é: "+resultado)
        }

        "+" ->{
            resultado = n1+n2
            println("O resultado da sua adição é: "+resultado)
        }

        "-" -> {
            resultado = n1-n2
            println("O resultado da sua diferença é: "+resultado)
        }

        else -> {
            "Operação Inválid"
        }
    }
}