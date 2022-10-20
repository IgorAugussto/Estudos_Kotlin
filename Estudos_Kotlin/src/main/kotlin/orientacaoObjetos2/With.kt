package orientacaoObjetos2

class Pessoa(anoNascimento: Int, nome: String) {

    fun dormir(): String {
        return "Dormindo...Zzz"
    }

    fun acordar(): String {
        return "Acordado! :)"
    }
}

//"With" é usado para economizar linhas e deixar um pouco mais legivel quando tem nomes grandes nas variaveis
fun main() {
    var pessoaCriadaParaExecucaoDeTestes: Pessoa = Pessoa(1985, "Frank")

    println( with(pessoaCriadaParaExecucaoDeTestes) {
        dormir()
        //acordar()
    })
}