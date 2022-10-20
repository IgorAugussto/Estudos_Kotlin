package exceçãoNullSafety

fun main() {
    val str: String? = null

    //Vai entrar no let somente se a variavel str não for nula. E dentro dela a variavel str se torna it
    str?.let {
        it.lowercase()
        it.length
    }
}