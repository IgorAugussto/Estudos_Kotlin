package maisSobreFuncoes

fun main() {
    println(media2(abc = false, 10f, 8f))
}
//Neste exemplo o "<T>" serve para sinalizar que essa função pode receber qualquer tipo como parametro
//Para usar outros tipo de parametros e ele sair como retorno usamos o J, porem para usar junto com o
// vararg, o mesmo tem que sempre estar por ultimo na ordem dos parametros como no exemplo abaixo e também
// é necessário nomear no momento de usar a função
fun <T, J> media2(abc: J, vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if(n is Float){
        soma += n
        }
    }
    return (soma / notas.size)
}