#include <stdio.h>

/// =====Verificar total, media, maior e menor===== //
int main() {
  int i, n = 10;
  float x[10], tt, maior, menor, media;

  printf("Teste - Verificar total, media, maior e menor\n");
  printf("\nDigite 10 números: \n");
  tt = 0;
  media = 0;
  maior = 0;

  for (i = 0; i < n; i++) {
    scanf("%f", &x[i]);
    tt += x[i];
    media = (tt / n);
    if (x[i] == 0) {
      menor = x[0];
      maior = x[0];
    }
    if (x[i] >= maior) {
      maior = x[i];
    }
    if (x[i] < menor) {
      menor = x[i];
    }
  }
  for (i = 0; i < n; i++) {
    printf("x[%2d] = %4.1f\n", i, x[i]);
  }
  printf("\nTotal = %.2f\n", tt);
  printf("\nMedia = %.2f\n", media);
  printf("\nMaior = %.2f\n", maior);
  printf("\nMenor = %.2f\n", menor);
  return 0;
}
/// =====Verificar total, media, maior e menor===== //