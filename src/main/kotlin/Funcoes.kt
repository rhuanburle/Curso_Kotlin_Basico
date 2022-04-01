fun main() {
    println (max1(10,5))
    dizOi(retornaNome(),24)
}

// Corpo de bloco
fun max(a:Int, b: Int): Int {
    return if (a > b) a else b
}

// Corpo de Expressão
fun max1(a: Int, b: Int) = if (a > b) a else b

// Curso Spring + Kotlin

fun retornaNome(): String {
    return "Gustavo"
}

fun dizOi(nome: String, idade: Int) {
    println("Oi $nome, parabens pelo seus $idade anos")
}