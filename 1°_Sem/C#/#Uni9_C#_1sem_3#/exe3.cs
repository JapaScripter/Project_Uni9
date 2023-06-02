using System;
using static Inputs;

class Exe3 {
  public static void run()
  {
    Console.WriteLine("\n\nTeste 3 - Somar Todos os Valores\n");
    float somatorio = 0, n, soma = 0;
    for(int i = 1; i <= 10; i++)
    {
      n = obterQualquer(String.Format("Digite o {0}º número, pode ser qualquer valor: ", i));
      soma += n;
    }
    Console.WriteLine("A soma de tudo é = {0}", soma);
    Console.WriteLine("");
  }
}