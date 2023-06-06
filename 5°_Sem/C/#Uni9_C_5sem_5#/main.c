/* =====Imports===== */
#include <stdio.h>
/* =====Imports===== */

/* =====Selection Sort===== */
int main() {

  /* =====Variáveis===== */
  int i, j, n = 10, aux;
  int v[10] = {15, 20, 8, 21, 19, 7, 1, 35, 4, 12};
  /* =====Variáveis===== */

  /* =====For print desordenados===== */
  printf("\n#Método Selection Sort#\n");

  printf("\n==========\n");

  printf("\nValores Desordenados\n\n");

  for (i = 0; i < n; i++) {
    printf("%2d * ", v[i]);
  }

  printf("\n\n==========\n");
  /* =====For print desordenados===== */

  /* =====For de ordenação===== */
  for (i = 0; i < n; i++) {
    for (j = 0; j < (n - 1) - i; j++) {
      if (v[j] > v[j + 1]) {
        aux = v[j];
        v[j] = v[j + 1];
        v[j + 1] = aux;
      }
    }
  }
  /* =====For de ordenação===== */

  /* =====For print ordenados===== */
  printf("\nValores Ordenados\n\n");

  for (i = 0; i < n; i++) {
    printf("%2d * ", v[i]);
  }

  printf("\n\n==========\n");
  /* =====For print ordenados===== */

  return 0;
}
/* =====Selection Sort===== */