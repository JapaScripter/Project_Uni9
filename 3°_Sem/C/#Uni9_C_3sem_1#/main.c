#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

// =====Calcular Idade===== //
main() {
  int ano_nasc, ano_atual, idade;
  setlocale(LC_ALL,"Portuguese");

  printf("Este programa calcula a idade.\n\n");
  printf("Digite o ano do seu nascimento: ");
  scanf("%d.", &ano_nasc);

  printf("Digite o ano atual ou o ano que deseja calcular: ");
  scanf("%d.", &ano_atual);

  idade = ano_atual - ano_nasc;

  printf("A sua idade é de %d anos\n", idade);
}
// =====Calcular Idade===== //