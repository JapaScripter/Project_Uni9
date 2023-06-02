/*EXERCICIO INCOMPLETO

Crie uma classe Turma com os seguintes atributos: curso (string), semestre (int), número de alunos (int), média da turma (float), e um vetor de alunos; 
Programe para classe Turma um construtor que receba como parâmetro um vetor de alunos, o curso e o semestre. 
Crie um método MediaTurma  para calcular a média da turma (média das médias dos alunos), e um método para exibir essa média ExibirMediaTurma.*/

using System;

class Turma {
  private Aluno[] alunos;
  private string curso;
  private int semestre;
  private int numeroalunos;
  private float media;

  public Turma(Aluno[] alunos, string curso, int semestre) {
    this.alunos = alunos;
    this.curso = curso;
    this.semestre = semestre;
    this.numeroalunos = alunos.Length;
  }

  public void calcularMediaTurma() {
    float soma = 0f;
    for (int i = 0; i < this.numeroalunos; i++) {
      soma += this.alunos[i].media(); // Adicionar a média de cada aluno à variável soma.
    }
    this.media = soma / this.numeroalunos; // Dividir a soma das médias pelo número de alunos.
  }

  public string getCurso() {
    return this.curso;
  }

  public int getSemestre() {
    return this.semestre;
  }

  public float getMediaTurma() {
    return this.media;
  }
}