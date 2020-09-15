package br.com.digitalhouse.revisao

class Professor(var rd : String, nome : String, sobrenome : String) : Pessoa(nome, sobrenome) {

    init{
        println("Professor : $nome")
    }

    fun darAulas(aula: Aula) {
        println("Professor: $nome dando Aula da Materia: ${aula.materia}" )
    }

    fun fazerChamada(listaAlunos: MutableList<Aluno>) {
        for (aluno in listaAlunos) println("Nome do Aluno: ${aluno.nome}")
    }
}