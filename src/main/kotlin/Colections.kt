fun main() {

var mapNomeIdade = mutableMapOf("Gustavo" to 20, "Rhuan" to 30)
    println(mapNomeIdade)

    mapNomeIdade["Bruno"] = 30

    println(mapNomeIdade)

    mapNomeIdade.remove("bruno")

    println(mapNomeIdade)

    mapNomeIdade.putIfAbsent("Bruno", 24) // Adiciona somente se já não existir

    println(mapNomeIdade)


// ArrayList - Classe
//val frutas1 = ArrayList<String>()
//frutas1.add("Maça")
//frutas1.add("Banana")
//frutas1.add("Morango")
//println(frutas1)
//
//// ArrayList - função
//val frutas2 = arrayListOf("Maça", "Banana", "Morango")
//
//// Verificar se é da Biblioteca Padrão Java
//println(HashSet::class.java)
//
//// Kotlin proveitos
//    println(frutas2.last())
}
