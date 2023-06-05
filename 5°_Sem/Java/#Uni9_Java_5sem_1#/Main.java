
// =====Import===== //
import java.util.Scanner;
// =====Import===== //

// =====Formato de analisar notas===== //
class Main {
	public static void main(String[] args) {

		System.out.println("\nCalcula Valores!");

		// =====Variáveis===== //
		Scanner ler = new Scanner(System.in);
		int a, b;
		// =====Variáveis===== //

		// =====1º Valor===== //
		System.out.println("\nDigite o 1° valor: ");
		a = ler.nextInt();
		// =====1º Valor===== //

		// =====2º Valor===== //
		System.out.println("\nDigite o 2° valor: ");
		b = ler.nextInt();
		// =====2º Valor===== //

		// =====Cálculos===== //
		MathOperations calcular = new MathOperations(a, b);
		System.out.println("\nA soma dos valores é: " + calcular.somar());
		System.out.println("\nA subtração dos valores é: " + calcular.subtrair());
		System.out.println("\nA multiplicação dos valores é: " + calcular.multiplicar());
		System.out.println("\nA divisão dos valores é: " + calcular.dividir());
		System.out.println("\nÍndice de massa corporal é: " + calcular.calcular_IMC());
		// =====Cálculos===== //
	}
}
// =====Formato de analisar notas===== //