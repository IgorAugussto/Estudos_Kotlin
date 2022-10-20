package orientacaoObjetos2.herança

//No Kotlin é dessa forma que fazemos uma herança, colocando as palavras "open class"
open class Eletronico(var marca: String) {
    //Quem tem acesso ao "protected" é só quem herda dessa clase que no caso é a classe Computador
    protected fun ativarCorrente() {}

    fun ligar() {}
    fun desligar() {}
}

//Quem herda só herda o nome, sem o extends
class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {
        ativarCorrente()
    }
}

fun main() {
    var c: Computador = Computador("Dell")

    c.ligar()
    c.desligar()
    c.marca
}