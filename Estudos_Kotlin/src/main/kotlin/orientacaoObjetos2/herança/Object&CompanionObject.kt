package orientacaoObjetos2.herança

class Matematica {
    //"Companion object" é a mesma coisa que o "static" no Java, porem você coloca as variaveis e as
    //funções dentro dele. E só existe um, não é possível colcoar dois companions com nomes diferentes
    //Pode dar um nome, mas apenas um. Só inicializados quando eles são acessados pela primeira vez
    companion object {
        val PI = 3.1415

        init {
            println("Fui inicializado")
        }
    }
    //Já o "object" pode ter mais de um, e ele funciona igual o companion a única diferença é que pode
    //ter vários
    object obj1 {

    }
}

fun main() {
    Matematica.PI
    Matematica.PI
    Matematica.PI
}