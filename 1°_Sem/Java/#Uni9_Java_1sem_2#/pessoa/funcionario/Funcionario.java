package pessoa.funcionario;

import java.util.Date;
import pessoa.Pessoa;

public class Funcionario extends Pessoa {
  public String Cartao = "";
	public String CPF;

  public Funcionario(String _Nome, Date _Data, String CPF) {
    super(_Nome, _Data);
		this.CPF = CPF;
  }

  public String getNome(){
    return Nome;
  }

  public String getCPF(){
    return CPF;
  }

  @Override
    public String toString() {
        return "Nome: " + this.Nome + " | Data de Nascimento: " + this._Data.toString() + " | CPF: " + this.CPF;
    }
}