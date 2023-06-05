//=====Quinto Exercicio=====*/
// void main() {
  
//   Map<int, String> teste = {
//     1 : "Olá",
//     2 : "Tchau",
//     5 : ":)",
//     3 : ":(",
//     7 : "Olá"
//   };
  
//   print(teste);
  
//   Map<String, double> notas = {};
  
//   notas["Antonio"] = 10;
//   notas["Marcelo"] = 9;
//   notas["Elias"] = 8.5;
//   notas["Traue"] = 6;
  
//   print(notas["Marcelo"]);
  
//   notas["Marcelo"] = 10;
  
//   print(notas["Marcelo"]);
  
// }
//=====Quinto Exercicio=====*/

//=====Quarta Exercicio=====*/
// //escopo de variáveis


// //escopo GLOBAL
// double x = 10;
// double y = 20;

// void main() {
//   //escopo local
//   double k = 20;
//   double l = 30;
  
//   print(somar(x, y));
//   print(somar(k, l));
//   mostraValores();
  
  
//   //print(multiplica(3, 7)); //neste ponto a função ainda não está declarada
  
//   double multiplica(double a, double b) {
//     return a * b;
//   }
  
//   print(multiplica(3, 7)); 
  
// }


// double somar(double a, double b) {
//   return a + b;
// }

// void mostraValores() {
//   //print("K = $k"); //não posso fazer isso pois o "k" só existe no "main"
//   //print("L = $l"); //não posso fazer isso pois o "l" só existe no "main"
//   print("X = $x");
//   print("Y = $y");
//   //print(multiplica(3, 7)); //não posso pois a função de multiplciação é local do main
// }
//=====Quarta Exercicio=====*/

//=====Terceiro Exercicio=====*/
// //funções anônimas

// void main() {
   
//   criaBotao(
//     texto: "Salvar",
//     cor: "Green",
//     acao: () {
//       print("Salvando...");
//     }
//   );
// }


// void criaBotao({required String texto, 
//                 required Function acao, 
//                 int altura = 3, 
//                 int largura = 10, 
//                 String cor = "Blue"}) {
  
//   print("...Estou criando um botão...");
//   print(" Texto: $texto");
//   print(" Altura: $altura");
//   print(" Largura: $largura");
//   print(" Cor: $cor");
//   print(" Função de ação: ");
//   acao();
//   print("...Botão criado...");
// }
//=====Terceiro Exercicio=====*/

/*=====Segundo Exercicio=====*/
// //funcões com nullable
// //null safety

// void main() {
//   falarNome(
//     nome: "Thiago",
//     sobrenome: "Traue"
//   );
  
//   dizerNome(
//     nome: "Marcelo",
//   );
// }

// void falarNome({required String nome, String? sobrenome}) {
// //   if (sobrenome == null) {
// //     print("Olá $nome!");
// //   } else {
// //     print("Olá $nome, $sobrenome!");
// //   }
//   //é o mesmo que:
  
//   print(sobrenome == "" ? "Olá $nome" : "Olá $nome $sobrenome");
// }

// //convertendo uma variável "nullable" em "non nullable" (anulável para não anluável)
// void dizerNome({required String nome, String? sobrenome}) {
//   String sobre = sobrenome ?? "Oliveira";
//   print("Olá $nome $sobre");
// }
/*=====Segundo Exercicio=====*/

/*=====Primeiro Exercicio=====*/
// void main() {
//   saudar("Thiago", sobrenome: "Traue");
//   saudar("Guilherme");

//   falarOi("Helder", "Cândido");
//   falarOi("Antonio", "Quadro", mostraHorario: true);

//   double area = calculaAreaTriangulo("Tri Legal", base: 3, altura: 10);

//   print("A área deste triângulo é $area");
  
//   print("---");
  
//   criaBotao(texto: "Salvar");
//   criaBotao(texto: "Excluir", cor: "Vermelho");
  
//   //os parâmtros quando declarados dentro de {} podem ser acionados em qualquer ordem:
//   criaBotao(
//     cor: "Vermelho",
//     altura: 3,
//     largura: 21,
//     texto: "Excluir"
//   );
  
//   criaBotao(
//     texto: "Novo Registro", 
//     cor: "Verde",
//     largura: 10
//   );
// }

// void saudar(String nome, {String sobrenome = "Silva"}) {
//   print("Olá $nome $sobrenome, tudo bem?! Seja bem-vindo(a)!");
// }

// void falarOi(String nome, String sobrenome, {bool mostraHorario = false}) {
//   print("Olá $nome $sobrenome!");

//   if (mostraHorario) {
//     print("Agora são ${DateTime.now()}");
//   }
// }

// double calculaAreaTriangulo(String nomeTriangulo, {required int base, required int altura}) {
//   print("Calculando a área do triângulo $nomeTriangulo");
//   double area = (base * altura) / 2;
//   return area;
// }

// void criaBotao({required String texto, int altura = 20, int largura = 80, String cor = "Azul"}) {
//   print("Hmm estou criando um botão...");
//   print("Esse botão tem:");
//   print(" - Texto dentro do Botão: $texto");
//   print(" - Altura: $altura");
//   print(" - Largura: $largura");
//   print(" - Cor: $cor");
//   print(">> Botão criado!");
// }
/*=====Primeiro Exercicio=====*/