#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

// =====Calcular BRL/USD=====//
main() {
  double real, cotacao_dolar, total_dolar;
  setlocale(LC_ALL,"Portuguese");

  printf("Este programa converte reais em dólares\n\n");
  printf("Digite o valor em reais: R$ ");
  scanf("%lf.2.", &real);
  printf("Digite a cotação do dolar: R$ ");
  scanf("%lf.2.", &cotacao_dolar);
  total_dolar = real/cotacao_dolar;
  printf("Você tem USD$ %.2lf.\n\n", total_dolar);  
}
// =====Calcular BRL/USD=====//