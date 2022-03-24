class Pessoa (
    val nome: String,
    val idade: Int
)

fun main() {
    val pessoa1: Pessoa = Pessoa("Rhuan", 30)
    val pessoa2: Pessoa = Pessoa("Diogo", 25)

        println("Pessoa 1: ${pessoa1.nome}")
        println("Pessoa 2: ${pessoa2.nome}")

        println("Idade Pessoa 1: ${pessoa1.idade}")
        println("Idade Pessoa 2: ${pessoa2.idade}")
}