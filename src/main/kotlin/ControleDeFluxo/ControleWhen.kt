package ControleDeFluxo

fun main() {
    println(bonusWhen("Engenheiro de Software"))

    print(range(995))

}

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coorenador" -> 1500f
        "Engenheiro de Software" -> 10000f
        "Estagiario" -> 500f
        else -> 0f
    }
}

//Usado para definir se um número está dentro do outro ou não.
fun range(num: Int): String {
    return when (num) {
        in 1..10 -> "O número esta entre 1 e 10"
        in 10..100 -> "O número está entre 1 e 100"
        else -> "Nesse contexto o número não exite =/"
    }
}