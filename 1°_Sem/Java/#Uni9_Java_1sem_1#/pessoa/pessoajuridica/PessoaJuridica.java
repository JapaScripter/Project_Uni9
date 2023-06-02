package pessoa.pessoajuridica;

import java.util.Date;
import pessoa.Pessoa;

public class PessoaJuridica extends Pessoa {
  public String CNPJ;
  
  public PessoaJuridica(String _Nome, Date _Data, String CNPJ) {
    super(_Nome, _Data);
    this.CNPJ = CNPJ;
  }
}