// (1 + 2) + 4
fun avaliacao2(expressao: Expressao): Int =
    when (expressao) {
        is Numero -> {
            println("Expressão com numero: ${expressao.valor}")
            expressao.valor
        }
        is Soma -> avaliacao2(expressao.esquerdo) + avaliacao2(expressao.direito)
        else -> throw IllegalArgumentException("Expressão é desconhecida")
    }

fun main() {
    // ((1 + 2) + 4 = 7
    val resultado2 = avaliacao2(Soma(Soma(Numero(3), Numero(5)), Numero(6)))
    println(resultado2)
}