package orientacaoObjetos2

data class FormaData(val a: Int, val b: Int)

fun main() {
    val f1: FormaData = FormaData(10, 8)
    var f2: FormaData = FormaData(10, 8)

    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("-------------")
    println(f2.toString())
    println(f2.hashCode())
    println("-------------")
    f2 = f1.copy(50)
    println(f2)
}