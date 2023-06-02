import java.text.SimpleDateFormat;
import java.util.Date;
import pessoa.funcionario.Funcionario;

class Main {
	public static void main(String[] args) {
		Funcionario i = new Funcionario("Elias", new Date(), "123.456.789-00");
		System.out.println("Nome: " + i.getNome());
		System.out.println("CPF: " + i.getCPF());
		System.out.println("Cartão: " + i.Cartao);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data de Nascimento: " + dateFormat.format(i.get_Data()));
	}
}