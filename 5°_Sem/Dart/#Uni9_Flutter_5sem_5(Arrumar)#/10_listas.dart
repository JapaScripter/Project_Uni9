void main() {
  
  List<String> compras = ["Nutella", "Alface", "Salgadinho", "Miojo", "Amaciante"];
  
  print(compras.length);
  
  for (int i = 0; i < compras.length; i++) {
    print(compras[i]);
  }
  
  compras.add("Maçã");
  
  print(compras[5]);
  
  compras.removeAt(0);
  
  print(compras);
  
  List<dynamic> bla = [24, "Oi", true];
  
  for (int i = 0; i < bla.length; i++) {
    print(bla[i]);
  }
}