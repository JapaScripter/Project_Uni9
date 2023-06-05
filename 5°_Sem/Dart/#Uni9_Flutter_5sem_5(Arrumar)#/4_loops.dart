void main() {

  //while:
  int x = 1;
  while (x <= 10) {
    print(x);
    x++;
  }
  
  //do-while:
  int y = 1;
  do {
    print(y);
    y++;
  } while (y <= 10);
  
  //for:
  for (int i = 1; i <= 10; i++) {
    print(i);
  }
  
  List<String> nomes = ["Thiago", "Marcelo", "Guilherme"];
  
  //for-in:
  for (String nome in nomes) {
    print(nome);
  }
  
}