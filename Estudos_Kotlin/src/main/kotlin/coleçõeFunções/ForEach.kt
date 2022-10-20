package coleçõeFunções

fun main() {
    val data = gerarDados5()

//Estou passando item por item da lista e devolvendo o nome como resposta
    println(data.forEach { println(it.nome) })
    println("***************\n***************")
    println(data.filter { it.calorias > 500 }.forEach { println(it.nome) })
}

fun gerarDados5(): List<Receita> {
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

data class Receita5(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente5(val nome: String, val quantidade: Int)