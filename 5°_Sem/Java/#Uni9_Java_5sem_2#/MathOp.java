public class MathOp implements OperacoesMatematicas {
	private double a;
	private double b;
	public MathOp(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double somar() {
		return a + b;
	}

	public double subtrair() {
		return a - b;
	}

	public double multiplicar() {
		return a * b;
	}

	public double dividir() {
		return a / b;
	}

	public double calcular_IMC() {
		return a / (b * b);
	}
}