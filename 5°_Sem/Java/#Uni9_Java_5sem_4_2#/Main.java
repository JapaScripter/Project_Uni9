class Main {
  public static void main(String[] args) {
		//=====Dados Primitivos=====//
			// int i = 101_101;
			// byte b = 101;
			// short s = 10_101;
			// long l = 1_101_101_101;
			// double d = 101.101010101010101010101010D;
			// float f = 200.38f;
			// char letra = 'M';
			// String nome = "Carlos";
			// System.out.println("Valor Inteiro = " + i);
	 	//  System.out.println("Valor Byte = " + b);
	 	//  System.out.println("Valor Short = " + s);
	 	//  System.out.println("Valor Long = " + l);
			// System.out.println("Valor Double = " + d);
 	 // 		System.out.println("Valor Float = " + f);
  	// 	System.out.println("Letra = " + letra);
  	// 	System.out.println("Nome = " + nome);
		//=====Dados Primitivos=====//

		//=====Operadores Aritméticos=====//
		// int valor1 = 10;
		// int valor2 = 2;
		// System.out.println("Adição = " + (valor1 + valor2));
		// System.out.println("Subtração = " + (valor1 - valor2));
		// System.out.println("Multiplicação = " + (valor1 * valor2));
		// System.out.println("Divisão = " + (valor1 / valor2));
		// System.out.println("Módulo ou Resto da Divisão = " + (valor1 % valor2));
		//=====Operadores Aritméticos=====//

		//=====Operadores de Comparação=====//
		// > , >= , < , <= , ==(igual) , !=(diferente)
		// Obs: Toda comparação resulta em Booleano (True ou False)
		// int valor1 = 10;
		// int valor2 = 2;
		// boolean resultado1 = valor1 > valor2;
		// System.out.println("Resultado1 = " + resultado1);
		// boolean resultado2 = valor1 <= 3;
		// System.out.println("Resultado2 = " + resultado2);
		// boolean resultado3 = valor2 == 2;
		// System.out.println("Resultado3 = " + resultado3);
		// boolean resultado4 = valor2 != 2;
		// System.out.println("Resultado4 = " + resultado4);
		//=====Operadores de Comparação=====//
		
		//=====Operadores Lógicos=====//
		// E(&&) = Para o resultado ser verdadeiro, todas as comparações devem ser verdadeiras;
		// OU(||) = Para o resultado ser verdadeiro, basta apenas um comparação ser verdadeira;
		// int valor1 = 10;
		// int valor2 = 2;
		// boolean resultado1 = (valor1 >= 8) && (valor2 <= 20) && (valor1 > valor2);
		// System.out.println("Resultado1 = " + resultado1);
		// boolean resultado2 = (valor1 >= 8) && (valor2 <= 20) && (valor1 < valor2);
		// System.out.println("Resultado2 = " + resultado2);
		// boolean resultado3 = (valor1 == 8) || (valor2 == 20) || (valor1 > valor2);
		// System.out.println("Resultado3 = " + resultado3);
		// boolean resultado4 = (valor1 == 8) || (valor2 == 20) || (valor1 < valor2);
		// System.out.println("Resultado4 = " + resultado4);
		//=====Operadores Lógicos=====//

		//=====Operadores Aritméticos + Comparação + Lógicos=====//
		// boolean resultado5 = valor1 * 5 > valor2 + 45 && ((70 / 2) - 6) > valor1 * 4 || valor2 * 5 <= 10;
		// System.out.println("Resultado5 = " + resultado5);
		// boolean resultado6 = valor1 * 5 > valor2 + 45 && ((70 * 2) - 6) > valor1 * 4 || valor2 * 5 <= 10;
		// System.out.println("Resultado6 = " + resultado6);
		// boolean resultado7 = valor1 * 5 > valor2 + 45 && ((70 * 2) - 6) <= valor1 * 4 || valor1 * 5 == 10;
		// System.out.println("Resultado7 = " + resultado7);
		//=====Operadores Aritméticos + Comparação + Lógicos=====//

		//=====Operadores Aritméticos + Comparação + Lógicos=====//
		// double nota = 7.5;
		// double nota = 3.5;
		// if (nota >= 5){
		// 	System.out.println("Aprovado com nota: " + nota);
		// }
		// else {
		// 	System.out.println("Reprovado com nota: " + nota);
		// }
		
		// double nota = 3;
		// double nota = 5;
		// double nota = 7;
		// if (nota >= 7){
		// 	System.out.println("Aprovado com nota: " + nota);
		// }
		// else if (nota >= 5 && nota < 7){
		// 	System.out.println("Recuperação com nota: " + nota);
		// }
		// else{
		// 	System.out.println("Reprovado com nota: " + nota);
		// }

		// double nota = -1;
		// double nota = 3;
		// double nota = 5;
		// double nota = 7;
		// double nota = 11;
		// if (nota >= 7 && nota <= 10){
		// 	System.out.println("Aprovado com nota: " + nota);
		// }
		// else if (nota >= 5 && nota < 7){
		// 	System.out.println("Recuperação com nota: " + nota);
		// }
		// else if (nota >= 0 && nota <= 5){
		// 	System.out.println("Reprovado com nota: " + nota);
		// }
		// else if (nota > 10 || nota < 0){
		// 	System.out.println("Valor Inválido");
		// }

		// double bim1 = 8, bim2 = 6, bim3 = 9, bim4 = 10;
		// double media = (bim1 + bim2 + bim3 + bim4) / 4;
		// System.out.println("1° bimestre nota: " + bim1);
		// System.out.println("2° bimestre nota: " + bim2);
		// System.out.println("3° bimestre nota: " + bim3);
		// System.out.println("4° bimestre nota: " + bim4);
		// if (media >= 5) {
		// 	System.out.println("Aprovado com média de: " + media);
		// }
		
		// System.out.println("Mensagem: Fim do Programa!!!");
		//=====Operadores Aritméticos + Comparação + Lógicos=====//
		
		//=====Case Sensitive com Variáveis=====//
		// Obs: Vai dar erro valor printado com V maiúsculo
		// int valor = 10;
		// System.out.println("Valor: " + Valor);

		// Obs: Vai dar erro valor printado com V minúsculo
		// int Valor = 10;
		// System.out.println("Valor: " + valor);
		//=====Case Sensitive com Variáveis=====//

		//=====Camel Case=====//
		// char estadoCivil = 's';
		// char estadoCivil = 'c';
		// char estadoCivil = 'd';
		// char estadoCivil = 'v';
		// char estadoCivil = 'a';
		
		// switch(estadoCivil){
		// 	case 's':
		// 		System.out.println("Solteiro");
		// 		break;
		// 	case 'c':
		// 		System.out.println("Casado");
		// 		break;
		// 	case 'd':
		// 		System.out.println("Divorciado");
		// 		break;
		// 	case 'v':
		// 		System.out.println("Viúvo");
		// 		break;
		// 	default:
		// 		System.out.println("Opção Inválida");
		// 		break;
		// }
		// System.out.println("Mensagem: Fim do Programa!!!");
		//=====Camel Case=====//
  }
}