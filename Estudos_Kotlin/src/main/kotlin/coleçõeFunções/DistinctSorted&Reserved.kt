package coleçõeFunções

fun main() {
    val data = gerarDados8()
    val lst = listOf<Int>(1, 4, 5, 6, 3, 2, 8, 1, 1, 1, 1, 3, 3)
//Funciona com qualquer tipo e não só com Int
    println(lst.distinct())
    println(data.distinctBy { it.calorias })

//Ordena a lista de foram crescente do menor para o maior
    println(lst.sorted())

//Ordena a lista de foram crescente do maior para o menor
    println(lst.sortedDescending())

//Reverte a lista que eu tenho
    println(lst.reversed())

}

fun gerarDados8(): List<Receita> {
    return listOf(
        Receita(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 5),
                Ingrediente("Presunto", 5),
                Ingrediente("Presunto", 5)
            )
        ),
        Receita("Panqueca", 500),
        Receita("Omelete", 200),
        Receita("Parmegiana", 700),
        Receita("Sopa de Feijão", 300),
        Receita(
            "Hamburguer", 2000,
            listOf(
                Ingrediente("Pão", 1),
                Ingrediente("Hamburguer", 3),
                Ingrediente("Queijo", 1),
                Ingrediente("Catupiry", 1),
                Ingrediente("Bacon", 3),
                Ingrediente("Alface", 1),
                Ingrediente("Tomate", 1)
            )
        )
    )
}

data class Receita8(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente8(val nome: String, val quantidade: Int)