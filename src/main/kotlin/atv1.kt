fun main() {

    println("Olá, vamos aos calculos da média?")

    println("Digite a sua primeira nota:")
    val n1 = readln().toInt()

    println("Digite sua segunda nota: ")
    val n2 = readln().toInt()

    println("Digite sua terceira nota: ")
    val n3 = readln().toInt()

    println("Digite sua quarta nota: ")
    val n4 = readln().toInt()

    val soma = n1+n2+n3+n4
    val media = soma/4

    println("Sua média é "+media)
}