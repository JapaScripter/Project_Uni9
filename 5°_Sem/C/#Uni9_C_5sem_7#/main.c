#include <stdio.h>
#include <stdlib.h>
#define TAM 10

// =====Método Fila===== //
int elementos[TAM] = {0}, menu, valor;
int p = 0, u = 0, t = 0;

int isempty() {
  if (t == 0) {
    return 1;
  } else {
    return 0;
  }
}

int isfull() {
  if (t == TAM) {
    return 1;
  } else {
    return 0;
  }
}

void inserir(int n) {
  if (isfull()) {
    printf("Tá Cheio! Apaga algum ai...");
  } else {
    elementos[u] = n;
    u = (u + 1) % TAM;
    t++;
  }
}

void retirar() {
  if (isempty()) {
    printf("Não tem nada na fila!");
  } else {
    int n = elementos[p];
    elementos[p] = 0;
    t--;
    p = (p + 1) % TAM;
  }
}

void listar() {
  system("clear");
  printf("Lista da Fila: ");
  for (int i = p; i < TAM; i++) {
    printf("%d ", elementos[i]);
  }
}

void exibirPrimeiro() {
  if (isempty()) {
    printf("Não tem nada na fila");
  } else {
    printf("%d", elementos[p]);
  }
}

int menus() {
  int opcao;
  printf("=== Fila Circular ===\n\n");
  printf("1. Inserir elemento\n");
  printf("2. Retirar elemento\n");
  printf("3. Listar elementos\n");
  printf("4. Exibir primeiro\n");
  printf("0. Sair\n");
  printf("\nEscolha uma opção: ");
  scanf("%d", &opcao);
  return opcao;
}

int main() {
  system("clear");
  do {
    menu = menus();
    switch (menu) {
    case 1:
      printf("Digite o valor a ser inserido: ");
      scanf("%d", &valor);
      inserir(valor);
      break;
    case 2:
      retirar();
      break;
    case 3:
      listar();
      break;
    case 4:
      exibirPrimeiro();
      break;
    case 0:
      printf("Saindo...\n");
      break;
    default:
      printf("Opção inválida\n");
    }
  } while (menu != 0);

  return 0;
}
// =====Método Fila===== //