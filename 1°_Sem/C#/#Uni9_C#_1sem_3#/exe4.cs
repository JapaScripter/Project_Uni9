using System;
using static Inputs;

class Exe4 {
  public static void run()
  {
    Console.WriteLine("\n\nTeste 4 - Verificar quantos números positivos e negativos foram digitados\n");
    int positivos = 0, negativos = 0;
    float n;
    for(int i = 1; i <= 10; i++)
    {
      n = obterQualquer(String.Format("Digite o {0}º número qualquer: ", i));
      if(n > 0) positivos++;
      else if(n < 0) negativos++;
    }
    Console.WriteLine("De 10 números digitados temos: {0} número(s) positivo(s)", positivos);
    Console.WriteLine("De 10 números digitados temos: {0} número(s) negativo(s)", negativos);
    Console.WriteLine("");
  }
}
