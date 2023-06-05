package funcionario;

public class Funcionario {
  private String nome;
  private int quantidadeFilhos;
  private char sexo;
  private double salario;
  private boolean status;

  public Funcionario(String nome, int quantidadeFilhos, char sexo, double salario, boolean status) {
    this.nome = nome;
    this.quantidadeFilhos = quantidadeFilhos;
    this.sexo = sexo;
    this.salario = salario;
    this.status = status;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getQuantidadeFilhos() {
    return quantidadeFilhos;
  }

  public void setQuantidadeFilhos(int quantidadeFilhos) {
    this.quantidadeFilhos = quantidadeFilhos;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}