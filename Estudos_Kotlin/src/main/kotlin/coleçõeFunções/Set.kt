package coleçõeFunções

//Principal diferença do set para o list é que o set não permite valores repetidos
//Set também não existe index, então não é possivel usar o "set2.removeAt"
fun main() {
    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid", "Madrid")
    val set2: MutableSet<String> = mutableSetOf()

    set2.add("São Paulo")
    set2.add("Rio de Janeiro")
    set2.remove("São Paulo")
    set2.size

    println(set1)
    println(set2)
    println(set2.contains("São Paulo"))
}