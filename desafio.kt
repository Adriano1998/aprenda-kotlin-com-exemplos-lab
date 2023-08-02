// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome:String, val idMatricula: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(val nome: String, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()

    val conteudos = mutableListOf<ConteudoEducacional>()
    
    fun matricular(vararg usuario: Usuario) {
        inscritos.addAll(usuario)
    }

     fun terminouCurso(usuario: Usuario){
        inscritos.remove(usuario)
    }

       fun adicionarConteudo(conteudoEducacional: ConteudoEducacional) {
        conteudos.add(conteudoEducacional)
    }
}

fun main() {

    val usuario1 = Usuario("Manoel", 4546)
    val usuario2 = Usuario("Adriano", 6575)
    val conteudo1 = ConteudoEducacional("Orientacao a Objetos", 45)

    val formacaoKotlin = Formacao("Kotlin", Nivel.BASICO)
    
    formacaoKotlin.adicionarConteudo(conteudo1)
    
    formacaoKotlin.matricular(usuario1, usuario2)
    formacaoKotlin.terminouCurso(usuario2)
}
