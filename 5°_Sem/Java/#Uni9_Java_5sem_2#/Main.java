import java.util.Scanner;

// =====Calculadora de Operações=====//
public class Main {
	public static void main(String[] args) {
		System.out.println("\nCalculadora de operações com 2 valores");
		// variaveis
		double a, b;
		Scanner ler = new Scanner(System.in);
		// 1º Valores
		System.out.print("\n\nDigite o 1° valor: ");
		a = ler.nextDouble();

		System.out.print("\nDigite o 2° valor: ");
		b = ler.nextDouble();

		// Instanciar a classe MathOp
		OperacoesMatematicas calcular = new MathOp(a, b);

		System.out.print("\n----------------------");
		System.out.print("\nA soma dos valores é: " + calcular.somar());
		System.out.print("\nA subtração dos valores é: " + calcular.subtrair());
		System.out.print("\nA multiplicação dos valores é: " + calcular.multiplicar());
		System.out.print("\nA divisão dos valores é: " + calcular.dividir());
		System.out.print("\n----------------------\n");
		System.out.print("Informe o Peso: ");
		a = ler.nextDouble();

		System.out.print("Informe a Altura: ");
		b = ler.nextDouble();
		// Instanciar a classe MathOp
		OperacoesMatematicas imc = new MathOp(a, b);

		MathOp mathOp = (MathOp) imc;
		System.out.print("\nO valor do IMC é = " + mathOp.calcular_IMC());
	}
}
// =====Calculadora de Operações=====//