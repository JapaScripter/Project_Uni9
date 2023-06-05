#include <stdio.h>

int main() {
  double d1, d2, d3, v1, v2, v3, vm, divisor;

  printf("Digite as distâncias em metros e velocidades em m/s em três pontos distintos:\n");
  printf("Distância 1 (m): ");
  scanf("%lf", &d1);
  printf("Velocidade 1 (m/s): ");
  scanf("%lf", &v1);

  printf("Distância 2 (m): ");
  scanf("%lf", &d2);
  printf("Velocidade 2 (m/s): ");
  scanf("%lf", &v2);

  printf("Distância 3 (m): ");
  scanf("%lf", &d3);
  printf("Velocidade 3 (m/s): ");
  scanf("%lf", &v3);

  divisor = (d3 - d2) / v2 - (d1 - d2) / v1;

  if (divisor == 0) {
    printf("As velocidades entre esses pontos não são consistentes. Não é possível calcular a velocidade média.\n");
  } else {
    vm = (d3 - d1) / divisor + ((d1 - d2) / v1);
    printf("A velocidade média é %.2lf m/s.\n", vm);
  }

  return 0;
}