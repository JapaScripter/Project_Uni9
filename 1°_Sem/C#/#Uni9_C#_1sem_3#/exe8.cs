using System;
using static Inputs;

class Exe8 {
  public static void run()
  {
    Console.WriteLine("\n\nTeste 8 - Fatorial\n");
    int n = obterInteiro(); 
    Console.WriteLine("Fatorial de {0} é: {1}", n, fatorial(n));
  }
  public static int fatorial(int n)
  {
    if(n == 1) return n;
    return n * fatorial(n-1);
  }
}