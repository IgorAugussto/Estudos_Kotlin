package coleçõeFunções

fun main() {
    val data = gerarDados2()

//"sum()" só pode somar números e nad além disso
    println(listOf<Int>().sum())
//Nesse caso da receita que é uma String usamos "sumOf()"
    println(data.sumOf { it.calorias })
}

fun gerarDados2(): List<Receita1> {
    return listOf(
        Receita1(
            "Lasanha", 1200,
            listOf(
                Ingrediente("Presunto", 5),
                Ingrediente("Queijo", 5),
                Ingrediente("Presunto", 5),
                Ingrediente("Presunto", 5)
            )
        ),
        Receita1("Panqueca", 500),
        Receita1("Omelete", 200),
        Receita1("Parmegiana", 700),
        Receita1("Sopa de Feijão", 300),
        Receita1(
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

data class Receita2(val nome: String, val calorias: Int, val ingredientes: List<Ingrediente> = listOf())
data class Ingrediente2(val nome: String, val quantidade: Int)