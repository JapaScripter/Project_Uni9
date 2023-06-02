package pessoa.funcionario;

import java.util.Date;
import pessoa.pessoafisica.PessoaFisica;

public class Funcionario extends PessoaFisica {
  public String Cartao = "";

  public Funcionario(String _Nome, Date _Data, String CPF) {
    super(_Nome, _Data, CPF);
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