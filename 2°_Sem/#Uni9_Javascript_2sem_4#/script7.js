/* =====Colocar Linha===== */
document.write("<hr>");
/* =====Colocar Linha===== */

/* =====Titulo===== */
document.write("Teste 7 - Verificar se é igual");
/* =====Titulo===== */

/* =====Pular Linha===== */
document.write("<br>");
/* =====Pular Linha===== */

/* =====Declarar Variáveis===== */
var a,b,c,d;
a=50;
b=120;
c=200;
d=(a<=b) && (a>=c);
document.write("<br>O valor de a é = ", a, ", e o tipo de a é = ", typeof(a));
document.write("<br>O valor de b é = ", b, ", e o tipo de b é = ", typeof(b));
document.write("<br>O valor de c é = ", c, ", e o tipo de c é = ", typeof(c));
/* =====Declarar Variáveis===== */

/* =====Printar Variáveis===== */
document.write("<br>O valor de ", a, " <= ", b, " e ", a, " >= ", c, " ? Sim(true) ou Não(false): " + d);
/* =====Printar Variáveis===== */