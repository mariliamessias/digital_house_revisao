package br.com.digitalhouse.revisao

class Curso (
        var nome: String,
        val listaAulas: MutableList<Aula>,
        val listaAlunos: MutableList<Aluno>,
        val professor : Professor) {
}