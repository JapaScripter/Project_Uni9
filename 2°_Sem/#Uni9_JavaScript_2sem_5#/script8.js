/* =====Colocar Linha===== */
document.write("<hr>");
/* =====Colocar Linha===== */

/* =====Titulo===== */
document.write("Teste 8 - Verificar a e b igual, maior ou menor?");
/* =====Titulo===== */

/* =====Pular Linha===== */
document.write("<br>");
document.write("<br>");
/* =====Pular Linha===== */

/* =====Declarar Variáveis===== */
var a,b;
/* =====Declarar Variáveis===== */

/* =====Printar Variáveis===== */
a = parseInt(prompt("Teste 8 - Digite o número de a:"));
b = parseInt(prompt("Teste 8 - Digite o número de b"));
if (a == b) {
document.write("A variável a: " + a + " é igual a variável b: " + b);
}
else if (a < b){
document.write("A variável a: " + a + " é menor a variável b: " + b);
}
else{
document.write("A variável a: " + a + " é maior a variável b: " + b);
}
/* =====Printar Variáveis===== */