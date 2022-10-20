package orientacaoObjetos2

//Limita o intervalo de valores
enum class Prioridade(val value: Int) {
    BAIXA(1) {
        override fun toString(): String {
            return "prioridade baixa: $value"
        }
    },
    MEDIA(5){
        override fun toString(): String {
            return "Prioridade média: $value"
        }
            },
    ALTA(15){
        override fun toString(): String {
            return "Prioridade alta: $value"
        }
    }
}

fun main() {
    for (p in Prioridade.values()){
        println(p)
    }
}