package exceçãoNullSafety

//Isso não é um operador ternario, no Kotlin não existe operador ternario
fun main() {
    val str: String? = null
    println(str ?: "nulo")

//Opção para operdador ternario

    val idade = 18
    val str2 = if(idade >= 18)"Maior de idade" else "Menor de idade"
    println(str2)
}