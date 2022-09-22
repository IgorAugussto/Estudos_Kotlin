fun main() {
    transformarAno(4)
    println(quantidadeChar("Igor"))
    println(calcularAoCubo(3))
    println(milhasKm(100f))
    println(ex5("kjfzkjfgJKAJLKFJDBVLJDFDSJGIRHjhHçkjflzkjbfjbbkjfhaajkefhç"))
}

fun transformarAno(anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

fun quantidadeChar(nome: String) = nome.length

fun calcularAoCubo(num: Int) = num * num * num

fun milhasKm(milhas: Float): Float = milhas * 1.6f

fun ex5(str: String) {
    print(str.replace("a", "x", true).lowercase())
}

