package exceçãoNullSafety

fun main() {

    try {
        val s: String? = null
        print(s!!.length)

        val a = 10 / 0
    }catch (e: NullPointerException){
        println("Variavel nula !")
    } catch (e: ArithmeticException){
        println("Impossivel dividir por zero!")
      //"Exeception" é usado quando não sabemos qual o tipo do erro, se é um NullPointer ou um Arithmetic
      //é a exceção mais genérica. Só cai na Exception quando não cair em nenhuma outra exceção mais especifica
    } catch (e: Exception){
        println("Genérica")
    }
    //"Finally" é um bloco que sempre vai ser executado quando chamado
    finally {
        println("Finally")
    }

    print("Fim :)")
}