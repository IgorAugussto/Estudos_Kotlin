package orientacaoObjetos2

class Receita(){
    //Significa que ela vai ser inicializada mais tarde, pode ser em um função, com init mas temos que
    //Gatantir de que ela vai er realmente inicializada
    lateinit var instrucoes: String

    fun gerarReceita(){
        instrucoes = "Lave as mãos..."
    }
    //Vai verirficar se a "instruções" não foi inicializada ele vai chamar o "gerarReceita" para inicializar
    fun imprimirReceita(){
        if (!this::instrucoes.isInitialized){
            instrucoes = "Lave as mãos..."
        }
    }
}

fun main() {
    var r: Receita = Receita()
    r.imprimirReceita()
    println(r.instrucoes)
}