using System;

class Turma 
{
  /*Crie uma classe Turma com os seguintes atributos: curso (string), semestre (int), número de alunos (int), média da turma (float), e um vetor de alunos;*/
  public string curso;
  public int semestre;
  public int nAlunos;
  public float mediaTurma;
  public Aluno[] vAlunos;

  /*Programe para classe Turma um construtor que receba como parâmetro um vetor de alunos, o curso e o semestre.*/
  public Turma(Aluno[] vAlunos, string curso, int semestre)
  {
    this.vAlunos = vAlunos;
    this.curso = curso;
    this.semestre = semestre;
  }

  /*Crie um método MediaTurma  para calcular a média da turma (média das médias dos alunos), e um método para exibir essa média ExibirMediaTurma.*/
  public void MediaTurma()
  {
    this.nAlunos = this.vAlunos.Length;
    this.mediaTurma = 0;
    for(int i = 0; i < this.nAlunos; i++)
    {
      this.mediaTurma += this.vAlunos[i].media;
    }
    this.mediaTurma /= this.nAlunos;
  }

  public void ExibirMediaTurma()
  {
    Console.WriteLine("A média da turma do semestre {0}, do curso {1} é igual a {2}.", this.semestre, this.curso, this.mediaTurma);
  }
}