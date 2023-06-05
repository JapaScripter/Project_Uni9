void main() {
  
  //variável "var" permite que tipo seja inferido:
  var altura = 1.78;
  var nome = "Thiago";
  var ativo = true;
  
  //variável "dynamic" que permite qualquer tipo
  dynamic x = 10;
  x = "dez";
  
  print("Altura: $altura, ${altura.runtimeType}");
  print("Nome: $nome, ${nome.runtimeType}");
  print("Ativo: $ativo, ${ativo.runtimeType}");
  print("x: $x, ${x.runtimeType}");
  
}