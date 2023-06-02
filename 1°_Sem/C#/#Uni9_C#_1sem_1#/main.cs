using System;

class MainClass {
  public static void Main (string[] args) {
    /* Na classe principal crie uma turma com cinco alunos, com nomes e notas fornecidos pelo usuário. */
    Turma turma;
    Aluno[] vAlunos = new Aluno[5];
    string nome;
    float nota1, nota2;
    for (int i = 0; i < 5; i++)
    {
      Console.WriteLine("Informe o nome do {0}º aluno(a):", i + 1);
      nome = Console.ReadLine();

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

      vAlunos[i] = new Aluno(nome, nota1, nota2);
    }

    /* O professor não define nos enunciados de onde esses valores vem, então vamos deixar fixos*/
    string curso = "Programação Visual";
    int semestre = 1;
    turma = new Turma(vAlunos, curso, semestre);
    
    /*Calcule e exiba as médias dos alunos*/
    for (int i = 0; i < 5; i++)
    {
      vAlunos[i].CalcularMedia();
      vAlunos[i].ExibirMedia();
    }

    /*e exiba a média da turma: "A média da turma do semestre 's', do curso 'c' é igual a 'm'.", substituindo 's', 'c' e 'm' pelo semestre, curso e média da turma, respectivamente.*/
    turma.MediaTurma();
    turma.ExibirMediaTurma();
  }
}