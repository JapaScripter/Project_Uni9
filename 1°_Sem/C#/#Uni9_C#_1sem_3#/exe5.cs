using System;
using static Inputs;

class Exe5 {
  public static void run()
  {
    Console.WriteLine("\nTeste 5 - Tabuada\n");
    int n = obterInteiroIntervalo(1, 10);
		Console.WriteLine("A Tabuada do número {0} é essa: \n", n);
    for(int i = 1; i < 10; i++)
    {
      Console.WriteLine("{0} x {1} = {2}", i, n, i*n);
    }
    Console.WriteLine("");
  }
}
