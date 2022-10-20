package anyUnitNothing

/*Any -> é a mesma coisa que o <T>, vai aceitar qualquer tipo seja Int, Float, Boolean ou String.

* Unit -> Vai informar que uma função não vai ter retorno, como se fosse o void do Java e no Kotlin caso
* não tenha nenhum retorno informar ele já entende que é Unit

* Nothing -> Devolve uma exceção, sempre vai devolver uma exceção. No exemplo abaixo imagine que duas pessoas
 estão trabalhando em um projeto no qual a pessoa A vai pegar os dados de um cliente e a pessoa B vai
 salvar os dados do cliente. Onde nesse exemplo a pessoa B não fez a funação que salva os dados pois
 não deu tempo, mas para não atrapalhar o trabalho da outra pessoa e permitir que ela continue sem
 interrupções, usamos o Nothing como no exemplo.*/
fun main() {
    //Sem erros por conta do Nothing.
    save()
    update()
}
//Podemos também colocar os parametros das funções caso necessario.
fun save(): Nothing{
    TODO("Não tive tempo de implementar a função")
}

fun update(): Nothing{
    TODO("Não tive tempo de implementar a função")
}