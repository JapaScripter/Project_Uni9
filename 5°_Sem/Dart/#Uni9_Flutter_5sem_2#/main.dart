void main() {
  print("\nOlá Uninove"); //você pode dar print com " ou ' (mantenha um padrão_)

  // =====Caracteristicas de Pessoa===== //
  print("\nNome, Idade, Altura, Fuma?\n");
  String nomeCompleto = "Thiago Traue"; //representa uma variável textual
  int idade = 35;
  double altura = 1.83;
  bool fumante = false;

  print("Nome: $nomeCompleto");
  print("Idade: $idade");
  print("Altura: $altura");
  print("Fuma? $fumante");
  // =====Caracteristicas de Pessoa===== //

  // =====Sobrenome e Dinheiro===== //
  print("\n\nSobrenome e Dinheiro");
  var sobrenome = "Traue"; //Assume o tipo da primeira atribuição
  dynamic saldo = 100.50; //Assume o tipo de qualquer variável

  print(sobrenome);
  print(saldo);
  // =====Sobrenome e Dinheiro===== //

  // =====Sobrenome===== //
  print("\n\nSobrenome");
  sobrenome =
      "Thiago"; //é permitida a troca para valores do MESMO TIPO da primeira atribuição
  print(sobrenome);
  // =====Sobrenome===== //

  // =====Dinheiro===== //
  print("\n\nDinheiro");
  saldo = "Zerado"; //o tipo pode ser alterado dinamicamente (em runtime)
  print(saldo);
  // =====Dinheiro===== //

  // =====Operações Matemáticas===== //
  print("\n\nOperações Numéricas");
  double x = 8;
  double y = 2;
  double z = 3;

  double soma = x + y;
  double sub = x - y;
  double mult = x * y;
  double div = x / y;

  print("Sendo X = $x e Y = $y, temos que:");
  print("A soma é $soma");
  print("A subtração é $sub");
  print("A multiplicação é $mult");
  print("A divisão é $div");
  // =====Operações Matemáticas===== //

  // =====Operações Matemáticas===== //
  print("\n\nOperações Numéricas");
  double conta = x + y * z; //30 ou 14???
  print(conta); //14 pois o dart respeita a matemática
  conta = (x + y) * z; //agora sim daria 30, ou seja, forçamos a soma primeira
  print(conta);
  // =====Operações Matemáticas===== //

  // =====Operações Incremento e Decremento===== //
  print("\n\nOperações Incremento e Decremento");
  int i = 4;
  print(i);
  i++; //é o mesmo que i = i + 1
  print(i);
  i += 2; //neste caso é o mesmo que i = i + 2
  print(i);
  i--; //é o mesmo que i = i - 1
  print(i);
  // =====Operações Incremento e Decremento===== //

  // =====Operações Incremento e Decremento===== //
  print("\n\nOperações Incremento e Decremento");
  String a = "2";
  String b = "4";
  // =====Operações Incremento e Decremento===== //

  print(a + b); //a "+" com valores tipo String, concatena (junta)

  //resto da divisão:
  int w = 123124;
  int resultado = w % 3; //quero saber qual o resto da divisão de w por 3
  print(resultado);

  // =====Calcular Idade===== //
  print("\n\nCalcular Idade");
  int idadeUsuario = 17;

  if (idadeUsuario >= 18) {
    //o resultado deve ser sempre booleano (true ou false)
    print("Pode entrar na baladinha!"); //se a condição der true, entra aqui
  } else {
    //"senão"
    print("Não pode entrar na baladinha");
  }
  // =====Operações Lógicas===== //
  print("\n\nOperações Lógicas");
  //operações lógicas:

  print(1 == 2); //falso
  print(1 < 2); //true
  print(1 <= 2); //true
  print(2 <= 2); //true
  print(2 < 2); //false
  print(3 >= 1); //true
  print(3 > 4); //false
  // =====Operações Lógicas===== //

  // =====Calcular Notas e ver se Aprovado ou Reprovado===== //
  print("\n\nCalcular Notas");
  double nota = 2;
  double dp = 2;

  if (nota >= 6) {
    print("Aprovado");
  } else if (nota >= 3.5 && dp >= 7) {
    print("Aprovado com a nota da DP");
  } else if (nota >= 3.5) {
    print("Reprovado com DP");
  } else {
    print("Reprovado");
  }
  // =====Calcular Notas e ver se Aprovado ou Reprovado===== //

  // =====Ver se Fuma ou Não Fuma===== //
  print("\n\nFuma ou Não Fuma");
  bool usuarioFuma = false;

  print(usuarioFuma ? "Fuma" : "Não fuma");
  // =====Ver se Fuma ou Não Fuma===== //
}
