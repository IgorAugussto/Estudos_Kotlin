package orientacaoObjetos2.herança

interface Evento {
    fun onSuccess()
}

class Programa{
    fun salvar(e: Evento){
        println("Abrindo conexão")
        println("Salando valores")
        println("Sucesso conexão fechada")
        e.onSuccess()
    }
}
//Fazendo dessa forma nó implementamos uma função anonima que permite a instancia de uma interface
fun main() {
    val p = Programa()
    p.salvar(object: Evento{
        override fun onSuccess() {
           println("On succes")
        }

    })
}