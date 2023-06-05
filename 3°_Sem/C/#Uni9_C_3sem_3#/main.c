#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

// =====Calcular se é maior de idade=====//
main() {
  int idade;
  setlocale(LC_ALL,"Portuguese");
	printf("Calcula sua idade\n\n");
	
	printf("Digite sua idade: ");
	scanf("%d", &idade);
	if(idade >= 18){
	  printf("Você é maior de idade, pode!");
	}
	else{
	  printf("Você é menor de idade, não pode!");
  }
}
// =====Calcular se é maior de idade=====//