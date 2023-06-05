package testefuncionario;
import funcionario.Funcionario;

public class TesteFuncionario {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("João da Silva", 2, 'M', 5000.0, true);
    System.out.println("Nome do Funcionário: " + funcionario.getNome());
    System.out.println("Quantidade de Filhos: " + funcionario.getQuantidadeFilhos());
    System.out.println("Sexo: " + funcionario.getSexo());
    System.out.println("Salário: " + funcionario.getSalario());
    System.out.println("Status: " + funcionario.isStatus());
  }
}