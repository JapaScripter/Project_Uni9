#include <locale.h>
#include <stdio.h>
#include <stdlib.h>

// =====Calcular Média=====//
main() {
  double nota1, nota2, media;
  setlocale(LC_ALL, "Portuguese");

  printf("Este programa calcula a média\n\n");
  printf("Digite a  1° nota: ");
  scanf("%lf.2.", &nota1);

  printf("Digite a 2° nota: ");
  scanf("%lf.2.", &nota2);

  media = (nota1 + nota2) / 2;

  printf("A média é %.2lf.\n\n", media);
}
// =====Calcular Média=====//