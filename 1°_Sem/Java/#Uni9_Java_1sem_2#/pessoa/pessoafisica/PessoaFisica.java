package pessoa.pessoafisica;

import java.util.Date;
import pessoa.Pessoa;

public class PessoaFisica extends Pessoa {
  public String CPF;

  public PessoaFisica(String _Nome, Date _Data, String CPF) {
    super(_Nome, _Data);
    this.CPF = CPF;
  }

  public String getNome() {
    return Nome;
  }

  public String getCPF() {
    return CPF;
  }

  @Override
    public String toString() {
        return "Nome: " + this.Nome + " | Data de Nascimento: " + this._Data.toString() + " | CPF: " + this.CPF;
    }
}