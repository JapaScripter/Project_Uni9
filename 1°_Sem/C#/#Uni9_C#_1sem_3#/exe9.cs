using System;
using static Inputs;

class Exe9 {
  public static void run()
  {
    Console.WriteLine("\n\nTeste 9 - Verifica qual o maior número digitado\n");
    float maior = obterQualquer(String.Format("Digite o {0}º número, pode ser qualquer um: ", 1)), n;
    for(int i = 2; i <= 5; i++)
    {
      if((n = obterQualquer(String.Format("Digite o {0}º número, pode ser qualquer um: ", i))) > maior)  maior = n;
    }
    Console.WriteLine("\nO maior número que você digitou é o: {0}", maior);
    Console.WriteLine("");
  }
}
