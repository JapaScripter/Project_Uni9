import org.eclipse.xtext.maven.Carro;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Sets.newLinkedHashSet;

import java.util.List;
import java.util.Set;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.eclipse.xtext.ISetup;

class Main {
	
	static void main(String[] args) {

		//Criando a referência e o objeto
		Carro novoCarro = new Carro();

		//Inserindo informações dentro do objeto
		novoCarro.marca = "VW";
		novoCarro.modelo = "Fox";
		novoCarro.cor = "Azul";
		novoCarro.km = 15560;

		//Pegando as informações do objeto e mostrando no console (saída)
		System.out.println("Marca: " + novoCarro.marca);
		System.out.println("Modelo: " + novoCarro.modelo);
		System.out.println("Cor: " + novoCarro.cor);
		System.out.println("Km: " + novoCarro.km);
		
	}
	
}