package exceçãoNullSafety

fun main() {
    //Nesse caso o Kotlin não deixa eu colocar um valor nulo, a não ser que coloque "?" para indicar
    //a que vai receber um valor nulo
    // ou "!!" que quer dizer que vamos assumir o erro caso você saiba que a variavel não é nula
    var s: String? = null

    //Mesma coisa serve quando eu vou usar a variavel que recebeu esse valo nulo
    print(s?.length)
}