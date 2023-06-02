using System;

class Aluno
{
/*Uma classe Aluno com os atributos:  nome (string), nota1 (float), nota2 (float), media (float);*/
  public string nome;
  public float nota1;
  public float nota2;
  public float media;

/*Programe um método CalcularMedia, e um método ExibirMedia que imprime na tela a mensagem ("A média do aluno 'n' é igual a 'm'."), sendo 'n' o nome do aluno e 'm' a média obtida.
*/
  public void CalcularMedia()
  {
    this.media = (this.nota1 + this.nota2)/2;
  }

  public void ExibirMedia()
  {
    Console.WriteLine("A média do aluno {0} é igual a {1}.", this.nome, this.media);
  }

  /*Crie para a classe Aluno um construtor que receba o nome e os valores para as duas notas.*/
  public Aluno(string nome, float nota1, float nota2)
  {
    this.nome = nome;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }
}