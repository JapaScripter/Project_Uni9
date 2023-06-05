/* =====Colocar Linha===== */
document.write("<hr>");
/* =====Colocar Linha===== */

/* =====Titulo===== */
document.write("Teste 3 - Soma e Subtração de Valores");
/* =====Titulo===== */

/* =====Pular Linha===== */
document.write("<br>");
/* =====Pular Linha===== */

/* =====Declarar Variáveis===== */
var a, b;
a = prompt("Teste 3 - Digite o valor de a");
a = parseInt(a);
b = prompt("Teste 3 - Digite o valor de b");
b = parseInt(b);
a += b;
b -= 5;
/* =====Declarar Variáveis===== */

/* =====Printar Variáveis===== */
document.write("<br> A soma ", a, " + ", b, " é o valor de é a que é = " + a);
document.write("<br> O valor de b é = " + b);
/* =====Printar Variáveis===== */