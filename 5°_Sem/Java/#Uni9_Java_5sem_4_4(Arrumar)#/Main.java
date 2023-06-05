package aula;

public class ProgramaPrincipal_1 {

	public static void main(String[] args) {
		
		Carro novoCarro = new Carro("VW","Fox","Azul",15560,50,12,28500);
		
		System.out.println("Marca: " + novoCarro.getMarca());
		System.out.println("Modelo: " + novoCarro.getModelo());
		System.out.println("Cor: " + novoCarro.getCor());
		System.out.println("Km: " + novoCarro.getKm());
		System.out.println("Capacidade Tanque: " + novoCarro.getCapacidadeTanque());
		System.out.println("Km Por Litro: " + novoCarro.getKmPorLitro());
		System.out.println("Rodagem do Veículo: " + novoCarro.calcularKm());
		System.out.println("Preço: " + novoCarro.getPreco());
		System.out.println("Desconto: " + novoCarro.calcularDesconto(4,2));
		
		System.out.println();
		
		Carro novoCarro2 = new Carro("Chevrolet","Onix","Preto",22350,45,10,30000);
		
		System.out.println("Marca: " + novoCarro2.getMarca());
		System.out.println("Modelo: " + novoCarro2.getModelo());
		System.out.println("Cor: " + novoCarro2.getCor());
		System.out.println("Km: " + novoCarro2.getKm());
		System.out.println("Capacidade Tanque: " + novoCarro2.getCapacidadeTanque());
		System.out.println("Km Por Litro: " + novoCarro2.getKmPorLitro());
		System.out.println("Rodagem do Veículo: " + novoCarro2.calcularKm());
		System.out.println("Preço: " + novoCarro2.getPreco());
		System.out.println("Desconto: " + novoCarro2.calcularDesconto(4,2));
		
		System.out.println();
		
		Carro novoCarro3 = new Carro("Fiat","Palio","Prata",0,47,14,33650);
		
		System.out.println("Marca: " + novoCarro3.getMarca());
		System.out.println("Modelo: " + novoCarro3.getModelo());
		System.out.println("Cor: " + novoCarro3.getCor());
		System.out.println("Km: " + novoCarro3.getKm());
		System.out.println("Capacidade Tanque: " + novoCarro3.getCapacidadeTanque());
		System.out.println("Km Por Litro: " + novoCarro3.getKmPorLitro());
		System.out.println("Rodagem do Veículo: " + novoCarro3.calcularKm());
		System.out.println("Preço: " + novoCarro3.getPreco());
		System.out.println("Desconto: " + novoCarro3.calcularDesconto(4,2));
		

	}

}
