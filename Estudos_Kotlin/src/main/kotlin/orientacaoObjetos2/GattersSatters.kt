package orientacaoObjetos2

//No Kotlin o get/set já está implicito, mas ainda é possivel colocar os metodos como no exemplo abaixo
//Para o get retornar "fala" e não entrar em loop, usamos a palavra "field" para retornar falar sem entrar em loop
class Animal2(var especie: String) {
    var fala: String = ""
        get() {
            println("Acesso get")
            return field
        }
        set(value) {
            println("Acesso set")
            field = value
        }
}

fun main() {
    var a: Animal2 = Animal2("cachorro")
    a.fala = "auuu"
    a.fala
}