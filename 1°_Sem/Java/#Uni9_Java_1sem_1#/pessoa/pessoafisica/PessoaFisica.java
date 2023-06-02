package pessoa.pessoafisica;

import java.util.Date;
import pessoa.Pessoa;

public class PessoaFisica extends Pessoa {
  public String CPF;
  
  public PessoaFisica(String _Nome, Date _Data, String CPF) {
    super(_Nome, _Data);
    this.CPF = CPF;
  }
  
  public String getNome(){
    return Nome;
  }
  
  public String getCPF(){
    return CPF;
  }
  
  public Date get_Data(){
    return _Data;
  }
}