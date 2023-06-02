using System;

class Exe6 {
  public static void run()
  {
    Console.WriteLine("\n\nTeste 6 - Equação de Somatória ∑ com valores elevados ao quadrado\n");
    double somatorio = 0;
    for(double i = 1; i <= 10; i++)
    {
			Console.WriteLine("i: {0} e somatorio: {1}", i, somatorio);
      somatorio += Math.Pow(i,2);
    }
    Console.WriteLine("Valor: {0}", somatorio);
    Console.WriteLine("");
  }
}
