import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import pessoa.Pessoa;
import pessoa.funcionario.Funcionario;
import pessoa.pessoafisica.PessoaFisica;
import pessoa.pessoajuridica.PessoaJuridica;

public class Main {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date date1 = null;
		Date date2 = null;
		Date date3 = null;
		Date date4 = null;

		try {
			date1 = dateFormat.parse("01/01/2000");
			date2 = dateFormat.parse("02/02/2000");
			date3 = dateFormat.parse("03/03/2000");
			date4 = dateFormat.parse("04/04/2000");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Pessoa p1 = new Pessoa("Elias", date1);
		Pessoa p2 = new PessoaFisica("Eli", date2, "12345678901");
		Pessoa p3 = new PessoaJuridica("Elia", date3, "12.345.678/0001-23");
		Pessoa p4 = new Funcionario("Elia", date4, "123.456.789-01");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}