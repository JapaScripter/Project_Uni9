using System;

class Inputs {

  public static int obterInteiro()
  {
    return obterInteiro(null);
  }

  public static int obterInteiro(string mensagem)
  {
    while(true)
    {
      try{
        if(null == mensagem)
          Console.WriteLine("Digite um numéro inteiro: ");
        else 
          Console.WriteLine(mensagem);
        return Convert.ToInt32(Console.ReadLine());
      } catch (Exception e){
        Console.WriteLine("Número inválido!");
      }
    }
  }


  public static float obterQualquer(string mensagem)
  {
    while(true)
    {
      try{
        if(null == mensagem)
          Console.WriteLine("Digite um numéro qualquer: ");
        else 
          Console.WriteLine(mensagem);
        return Convert.ToSingle(Console.ReadLine());
      } catch (Exception e){
        Console.WriteLine("Número inválido!");
      }
    }
  }

  public static int obterInteiroMaior0()
  {
    int retorno = 0;
    while((retorno = obterInteiro("Digite um numéro inteiro maior que 1: ")) <= 0)
    {
        Console.WriteLine("Número deve ser posivito e maior que zero!");
    }
    return retorno;
  }

  public static int obterInteiroIntervalo(int a, int b)
  {
    int retorno = 0;
    while(true)
    {
      retorno = obterInteiro(String.Format("Digite um numéro inteiro no intervalo de {0} a {1}: ", a, b));
      if(retorno >= a && retorno <= b)
        return retorno;
      Console.WriteLine(String.Format("Número deve estar inteiro no intervalo de {0} a {1}!",a , b));
    }
  }
}
