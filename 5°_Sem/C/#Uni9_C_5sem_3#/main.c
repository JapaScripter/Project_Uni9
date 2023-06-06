#include <stdio.h>

int main(void) {
	int A, B, i;

	printf("Teste - Printa a palavra cool de diversas formas\n");
	
	printf("\nEscolha um valor: ");
	scanf("%d",&i);

	//=====Teste 1=====//
	// for (A=0; A<i; A++){
	// 	printf("Cool ");
	// }
	//=====Teste 1=====//
		
	//=====Teste 2=====//
	// for (B=0; B<i; B++){
	// 	for (A=0; A<i; A++){
	// 		printf("Cool ");
	// 	}
	// 	printf("\n");
	// }
	//=====Teste 2=====//

	//=====Teste 3=====//
	// for (B=0; B<i; B++){
	// 	for (A=0; A<i; A++){
	// 		if(A <= B) {
	// 			printf("Cool ");
	// 		}
	// 		else {
	// 			printf(" ");
	// 		}
	// 	}
	// 	printf("\n");
	// }	
	//=====Teste 3=====//

	//=====Test 4=====//
	// for (B=0; B<i; B++){
	// 	for (A=0; A<i; A++){
	// 		if(A >= B) {
	// 			printf("Cool");
	// 		}
	// 		else{
	// 			printf("    ");
	// 		}
	// 	}
	// 	printf("\n");
	// }	
	//=====Teste 4=====//

	//=====Test 5=====//
	// for (B=0; B<i; B++){
	// 	for (A=0; A<i; A++){
	// 		if(A + B >= i-1) {
	// 			printf("Cool");
	// 		}
	// 		else{
	// 			printf("    ");
	// 		}
	// 	}
	// 	printf("\n");
	// }	
	//=====Teste 5=====//

	//=====Test 6=====//
	// for (B=0; B<i; B++){
	// 	for (A=0; A<i; A++){
	// 		if(A + B <= i-1) {
	// 			printf("Cool");
	// 		}
	// 		else{
	// 			printf("    ");
	// 		}
	// 	}
	// 	printf("\n");
	// }	
	//=====Teste 6=====//

	//=====Test 7=====//
	// for (B=0; B<i; B++){
	// 	for (A=0; A<(i*2-1); A++){
	// 		if ((A+B)>=(i-1) && (A >= B+i)){
	// 			printf("Cool");
	// 		}
	// 		printf("    ");
	// 	}
	// 	printf("\n");
	// }	
	//=====Teste 7=====//
  return 0;
}