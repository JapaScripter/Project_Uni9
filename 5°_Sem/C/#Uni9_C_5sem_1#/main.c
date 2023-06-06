#include <stdio.h>

// =====Verificar se você é de maior===== //
char nome[20];
int idade;
int continua = 1;

int main() {
	while (continua) {
		system("clear");
		printf("Teste - Verificar se você é maior de idade.\n");
	  printf("\nDigite o seu nome: ");
		scanf("%s",&nome);
		printf("Digite a sua idade: ");
		scanf("%d",&idade);
		if (idade >= 18)
			printf("\n%s, você pode entrar!\n",nome);
		else
			printf("\n%s, você não pode entrar!\n",nome);
		printf("\nDeseja continuar? (Digite 1-sim ou 0-não)\n");
		scanf("%d",&continua);
	}
	printf("\nFinalizamos aqui, até outro dia!!!\n");
  return 0;
}
// =====Verificar se você é de maior===== //