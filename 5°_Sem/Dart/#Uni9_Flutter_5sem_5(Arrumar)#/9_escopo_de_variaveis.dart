//escopo de variáveis

//escopo GLOBAL
double x = 10;
double y = 20;

void main() {
  //escopo local
  double k = 20;
  double l = 30;
  
  print(somar(x, y));
  print(somar(k, l));
  mostraValores();
  
  double resultado = calculaCirculo(2.0);
  print(resultado);
  
  print("---");
  
  double resultado2 = calculaRetangulo(10, 5);
  print(resultado2);
  
  print("---");
  
  calcularAreaTerreno(long: 20, larg: 30);
  calcularAreaTerreno(larg: 30, long: 20);
  
  print("---");
  print("Exemplo de lista de números como parâmetro");
  imprimirNumeros(3, 5, 2, 4, 7, 8, 10);
  
}


double somar(double a, double b) {
  return a + b;
}

void mostraValores() {
  //print("K = $k"); //não posso fazer isso pois o "k" só existe no "main"
  //print("L = $l"); //não posso fazer isso pois o "l" só existe no "main"
  print("X = $x");
  print("Y = $y");
  //print(multiplica(3, 7)); //não posso pois a função de multiplicaão é local do main
}

double calculaCirculo(double raio) {
  return 3.14 * raio * raio;
}

double calculaRetangulo(double base, double altura) {
  return base * altura;
}

void calcularAreaTerreno({required int long, required int larg}) {
  int area = long * larg;
  print("A área do terreno é de $area metros quadrados.");
}

void imprimirNumeros(List<int> numeros) {
  for (int num in numeros) {
    print(num);
  }
}

void imprimirNumeros2(List<int> numeros) {
  for (int i = 0; i < numeros.length; i++) {
    print(numeros[i]);
  }
}

void imprimirNumeros3(dynamic numeros) {
  for (int i = 0; i < numeros.length; i++) {
    print(numeros[i]);
  }
}