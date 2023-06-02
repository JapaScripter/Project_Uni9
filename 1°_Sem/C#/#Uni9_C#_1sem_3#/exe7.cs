using System;
using static Inputs;

class Exe7 {
  public static void run()
  {
    Console.WriteLine("\n\nTeste 7 - Sequência de Multiplos\n");
    int n = obterInteiro();
		Console.Write("Os multiplos de {0} são: \n", n);
    for(int i = 1; i <= 10; i++)
    {
      Console.Write("{0} ", i*n);
    }
    Console.WriteLine("");
  }
}
