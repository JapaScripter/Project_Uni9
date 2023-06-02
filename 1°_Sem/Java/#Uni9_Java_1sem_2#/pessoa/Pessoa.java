package pessoa;

import java.util.Date;

public class Pessoa {
  public String Nome;
  public Date _Data;
  
  public Pessoa(String _Nome, Date _Data) {
    this.Nome = _Nome;
    this._Data = _Data;
  }

  @Override
    public String toString() {
        return "Nome: " + this.Nome + " | Data de Nascimento: " + this._Data.toString();
    }
}