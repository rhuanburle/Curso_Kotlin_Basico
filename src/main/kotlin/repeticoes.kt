fun main() {
//    printa10a1()
//    printa1a10()
//    printaRange(10,30)
//    whileMenorQue10()
    doWhileMenorQue10()
}

fun whileMenorQue10() {
    var x = 0
    while(x <= 10) {
        println(x)
        x++
    }
}

fun doWhileMenorQue10() {
    var x = 0
    do {
        println(x)
        x++
    }while(x < 10)
}

fun printa1a10() {
    for(numero in 1 ..10) {
        println(numero)
    }
}

fun printa10a1() {
    for(numero in 10 downTo 1) {
        println(numero)
    }
}

fun printaRange(inico: Int, fim: Int) {
    for(numero in inico .. fim) {
        println(numero)
    }
}