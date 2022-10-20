package lambda

//Função lambda sempre está entre chaves como no exemplo abaixo.
//{ parâmetro -> corpo }

fun main() {

    reciveA { println("Hello!") }

    reciveB { x: Int -> x * x }

    reciveC { x: Int, y: Int ->
        println("Executando...")
        x * y
    }

}

//()[Parametro] -> [tipo de retorno]
fun reciveA(lambda: () -> Unit) {
    lambda()
}

fun reciveB(tt: (x: Int) -> Int) {}

fun reciveC(lamb: (x: Int, y: Int) -> Int) {}