package orientaçãoObjetos

//Essa é a forma do Kotlin declarar um construtor diferente do construtor padrão
class Pessoa(val anoNascimento: Int, var nome: String) {

    constructor(anoNascimento: Int, nome: String, documento: String) : this(anoNascimento, nome)

//Dessa forma nós proibimos a abertura de um construtor
//    private constructor()

    fun dormir() {

    }

    fun acordar() {

    }
}

fun main() {
    var pessoa: Pessoa = Pessoa(2000, "Fulano", "documento")

    pessoa.dormir()
    pessoa.acordar()

}