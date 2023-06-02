using System;
using static Inputs;

class Exe2 {
  public static void run()
  {
    Console.WriteLine("\n\nTeste 2 - Equação de Somatória ∑\n");
    int n = obterInteiroMaior0(), somatorio = 0;
    for(int i = 1; i <= n; i++)
    {
			Console.WriteLine("posição: {1} e somatorio: {2}", n, i, somatorio);
      somatorio += i;
    }
    Console.WriteLine("\nSomatória: {0}", somatorio);
    Console.WriteLine("");
  }
}
