package orientaçãoObjetos

class Animal(var especie: String){
    init {
        println("Init 1")
    }
    init {
        println("Init 2")
    }
}

fun main() {
    Animal("Cachorro")
}