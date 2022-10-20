package coleçõeFunções

fun main() {
    val data = gerarDados3()

//"Filter" é um predicado, ou seja, que devolve um boolean. Nesse caso a pergunta é se existe um nome igual
//a lasanha(sendo assim true nesse caso)
    println(data.filter { it.nome == "Lasanha" })
    println("*************************\n*************************")

//Outras formas de filtrar
    println(data.filter { it.calorias > 500 })
}

fun gerarDados3(): List<Receita> {
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

data class Receita3(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente3(val nome: String, val quantidade: Int)