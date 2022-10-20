package orientacaoObjetos2.herança

open class Eletronico2(var marca: String) {
    private fun corrente(Ativo: Boolean) {}
    fun ligar() {
        corrente(true)
    }

    //Para fazer um "override" usamos a mesma forma da herança
    open fun desligar() {
        corrente(false)
    }
}

class Computador2(marca: String) : Eletronico2(marca) {

    override fun desligar() {
        save()
        super.desligar()
    }
//"Overload" é quando temos a mesma função porem com assinaturas diferentes
    fun save() {}
    fun save(a: Int) {}
    fun save(b: Double) {}
    fun save(c: Float) {}
}

fun main() {
    var c: Computador = Computador("Dell")

    c.ligar()
    c.desligar()
    c.marca
}