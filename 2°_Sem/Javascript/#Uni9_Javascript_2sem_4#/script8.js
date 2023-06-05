/* =====Colocar Linha===== */
document.write("<hr>");
/* =====Colocar Linha===== */

/* =====Titulo===== */
document.write("Teste 8 - Verificar se é igual (mudar resposta pt-br)");
/* =====Titulo===== */

/* =====Pular Linha===== */
document.write("<br>");
/* =====Pular Linha===== */

/* =====Declarar Variáveis===== */
var a, b, c, d, e;
a = 50;
b = 120;
c = 200;
d = (a <= b) ? "Verdadeiro" : "Falso";
e = (a >= c) ? "Verdadeiro" : "Falso";
document.write("<br>O valor de a é = ", a, ", e o tipo de a é = ", typeof (a));
document.write("<br>O valor de b é = ", b, ", e o tipo de b é = ", typeof (b));
document.write("<br>O valor de c é = ", c, ", e o tipo de c é = ", typeof (c));
/* =====Declarar Variáveis===== */

/* =====Printar Variáveis===== */
document.write("<br><br>O valor de ", a, " <= ", b, " ? Sim(Verdadeiro) ou Não(Falso): " + d);
document.write("<br>O valor de ", a, " >= ", c, " ? Sim(Verdadeiro) ou Não(Falso): " + e);
/* =====Printar Variáveis===== */