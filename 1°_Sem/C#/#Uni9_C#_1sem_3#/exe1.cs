using System;

class Exe1 {
  public static void run()
  {
    Console.WriteLine("\nTeste 1 - Contar números de 1 a 100 somente pares\n");
    for(int i = 2; i <= 100; i++)
    {
      if(i%2 == 0)
        Console.Write("{0} ", i);
    }
    Console.WriteLine("");
  }
}
