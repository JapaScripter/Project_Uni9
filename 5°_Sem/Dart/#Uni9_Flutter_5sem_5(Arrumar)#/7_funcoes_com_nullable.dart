//funcões com nullable
//null safety

void main() {
  falarNome(
    nome: "Thiago",
    sobrenome: "Traue"
  );
  
  dizerNome(
    nome: "Marcelo",
  );
}

void falarNome({required String nome, String? sobrenome}) {
  print(sobrenome == null ? "Olá $nome" : "Olá $nome $sobrenome");
}

void dizerNome({required String nome}) {
  print("Seu nome é $nome");
}