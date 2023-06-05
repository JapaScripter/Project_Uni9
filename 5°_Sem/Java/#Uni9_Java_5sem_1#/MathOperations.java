public class MathOperations {
	// =====Atributos locais===== //
	double a, b;
	// =====Atributos locais===== //
	
	// =====Método Construtor===== //
	public MathOperations(double num_a, double num_b){
		a = num_a;
		b = num_b;
	}
	// =====Método Construtor===== //
	
	// =====Métodos===== //
	public double somar(){
		return (a + b);
	}
	public double subtrair(){
		return (a - b);
	}
	public double multiplicar(){
		return (a * b);
	}
	public double dividir(){
		return (a / b);
	}
	public double calcular_IMC(){
		return (a / (b * b) ); //  Não é o IMC verdadeiro, apenas uma estimativa
	}
	// =====Métodos===== //
}