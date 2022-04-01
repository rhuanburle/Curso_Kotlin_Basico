class MinhaClasse (
    var nome : String,
    var endereco : String,
    var idade : Int
){
  companion object {
      fun criaClasse(): MinhaClasse {
          return MinhaClasse("Gustavo", "Rua teste",24)
      }
  }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade : Int
){
    fun criaClasse(): SegundaClasse {
        return SegundaClasse("Gustavo", "Rua teste", 24)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("nome","endereço",10).criaClasse()

    var minhaClasse = MinhaClasse.criaClasse()
}