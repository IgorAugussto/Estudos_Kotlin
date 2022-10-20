package orientacaoObjetos2

class Animal(var especie: String){
    var fala: String = ""
    init {
        if (especie == "cachorro"){
            fala = "au"
        } else if (especie == "gato"){
            fala = "miau"
        } else{
            println("Nome incorreto, favor digitar 'cachorro' ou 'gato'")
        }
    }

    fun falar(){
        println(fala)
    }
}

fun main() {
    Animal("gato").falar()

    //caso queira guardar essa informações em variavel, segue exemplo abaixo.

    var animal: Animal = Animal("cachorro")
    animal.falar()
}