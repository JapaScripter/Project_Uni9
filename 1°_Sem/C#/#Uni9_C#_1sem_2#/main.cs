using System;

class MainClass {
  public static void Main(string[] args) {
    Aluno[] alunos = new Aluno[5];

    for (int i = 0; i < 5; i++) {
      Console.WriteLine("Informe o nome do aluno(a)");
      string nome = Console.ReadLine();

			float nota1, nota2; // Declare the nota1 and nota2 variables here
			
			// loop para a primeira nota
			do {
	      Console.WriteLine("Informe a primeira nota de {0}:", nome);
				string input = Console.ReadLine();
				if (!float.TryParse(input, out nota1) || nota1 < 0 || nota1 > 10) {
					Console.WriteLine("A nota que você informou está errada, digite uma nota que esteja entre 0 e 10.");
				}
			} while (nota1 < 0 || nota1 > 10);

      // loop para a segunda nota
      do {
	      Console.WriteLine("Informe a segunda nota de {0}:", nome);
				string input = Console.ReadLine();
				if (!float.TryParse(input, out nota2) || nota2 < 0 || nota2 > 10) {
					Console.WriteLine("A nota que você informou está errada, digite uma nota que esteja entre 0 e 10.");
				}
      } while (nota2 < 0 || nota2 > 10);

      alunos[i] = new Aluno(nome, nota1, nota2); // Adicionar um novo objeto Aluno ao vetor de alunos com as notas fornecidas pelo usuário e nome informado.
    }

    Turma turma = new Turma(alunos, "curso", 1); // Criar um objeto Turma com o vetor de alunos, curso e semestre.
    turma.calcularMediaTurma(); // Calcular a média da turma.
    
    Console.WriteLine($"A média da turma do semestre {turma.getSemestre()} do curso {turma.getCurso()} é igual a {turma.getMediaTurma()}"); // Imprimir a média da turma.
  }
}

class TurmaPrincipal { // Renomear a classe Turma para evitar conflitos com outra definição da mesma classe em outro arquivo.
  private Aluno[] alunos;
  private string curso;
  private int semestre;
  private int numeroalunos;
  private float media;

  public TurmaPrincipal(Aluno[] alunos, string curso, int semestre) {
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

class Aluno {
  private string nome;
  private float nota1;
  private float nota2;

  public Aluno(string nome, float nota1, float nota2) {
    this.nome = nome;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }

  public float media() {
    return (nota1 + nota2) / 2f;
  }
}