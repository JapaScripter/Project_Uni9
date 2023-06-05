// =====Import===== //
import java.util.Scanner;
// =====Import===== //

// =====Formato de analisar notas===== //
class Main {
  public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		float av1, av2, av3, media;
		String resposta;
		boolean x = true;
		boolean j = true;
		boolean l = true;

		// =====Main + Continuar===== //
		do{
			
			// =====Nota AV1 + While X===== //
			while (x = true) {
				System.out.print("==========\n");
				System.out.print("Informe a nota AV1: ");
				av1 = ler.nextFloat();
				if (av1 >= 0 && av1 <= 10) {
					
					// =====Nota AV2 + While J===== //
					while (j = true) {
						System.out.print("Informe a nota AV2: ");
						av2 = ler.nextFloat();
						if (av2 >= 0 && av2 <= 10) {

							// =====Nota AV3 + While L===== //
							while (l = true) {
								System.out.print("Informe a nota AV3: ");
								av3 = ler.nextFloat();
								if (av3 >= 0 && av3 <= 10) {
									
									System.out.print("==========\n");
									media = ((av1 + av2 + av3) / 3);
									System.out.printf("A média é: %.1f", media);
									
									if (media < 7 && media >= 0) {
										System.out.printf("\nReprovado com média: %.1f", media);
									}
									else if (media >= 7 && media <= 10) {
										System.out.printf("\nAprovado com média: %.1f", media);
									}
									
									int media_int;
									media_int = (int) media;
									
									switch(media_int) {
										case 10: System.out.println("\nVirou Bitcoin, só ta crescendo e ninguém para!");
										break;
										case 9: System.out.println("\nTá tipo o Flamengo só sentindo o cheirinho da Taça!");
										break;
										case 8: System.out.println("\nTá tipo o São Paulo só fazendo um a mais que a média!");
										break;
										case 7: System.out.println("\nQuase foi de Marilia Mendonça!");
										break;
										case 6: System.out.println("\nVai de Vasco!");
										break;
										case 5: System.out.println("\nVai ser um Tiago Nigro da vida, certeza!");
										break;
										case 4: System.out.println("\nVai ser um Warren Buffet da vida, certeza!");
										break;
										case 3: System.out.println("\nVai ser um Jeff Bezos da vida, certeza!");
										break;
										case 2: System.out.println("\nVai ser um Mark Zuckerberg da vida, certeza!");
										break;
										case 1: System.out.println("\nVai ser um Bill Gates da vida, certeza!");
										break;
										default: System.out.println("\nVai ser um Elon Musk da vida, certeza!");
										break;
									}	
									System.out.print("==========\n");
									break;
								}
								l = false;
								System.out.print("Valor inválido! Insira um valor entre 0 e 10\n");
							}
							break;
							// =====Nota AV1 + While L===== //
							
						}
						j = false;
						System.out.print("Valor inválido! Insira um valor entre 0 e 10\n");
					}
					break;
					// =====Nota AV3 + While J===== //
					
				}
				x = false;
				System.out.print("Valor inválido! Insira um valor entre 0 e 10\n");
			}
			// =====Nota AV1 + While X===== //
			
			System.out.print("Deseja continuar? (S/N): ");
			resposta = ler.next();
		}
		while (
			resposta.equalsIgnoreCase("S")
		);
		System.out.print("==========\n");
		System.out.print("\nPROGRAMA ENCERRADO! Até a próxima.\n");
		System.out.print("\n==========\n");
		// =====Main + Continuar===== //
			
	}
}
// =====Formato de analisar notas===== //
