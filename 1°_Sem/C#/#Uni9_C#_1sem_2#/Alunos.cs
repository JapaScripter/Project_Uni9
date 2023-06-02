/*Uma classe Aluno com os atributos:  nome (string), nota1 (float), nota2 (float), media (float); 
Programe um método CalcularMedia, e um método ExibirMedia que imprime na tela a mensagem ("A média do aluno 'n' é igual a 'm'."), sendo 'n' o nome do aluno e 'm' a média obtida.
Crie para a classe Aluno um construtor que receba o nome e os valores para as duas notas.*/

using System;
class Alunos {
  public static void run(){
    string nome;
    float nota1, nota2, media;
    Console.WriteLine("Insira o nome do aluno: ");
    nome = Convert.ToString(Console.ReadLine());
    Console.WriteLine("Insira a nota 1: ");
    nota1 = Convert.ToSingle(Console.ReadLine());
    Console.WriteLine("Insira a nota 2: ");
    nota2 = Convert.ToSingle(Console.ReadLine());
    media = (nota1 + nota2) / 2;
    Console.WriteLine("A média do aluno " + nome + " é igual a " + media);   
  }
}