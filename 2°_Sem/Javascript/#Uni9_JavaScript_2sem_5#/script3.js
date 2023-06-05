/* =====Colocar Linha===== */
document.write("<hr>");
/* =====Colocar Linha===== */

/* =====Titulo===== */
document.write("Teste 3 - Verifica se o valor é par ou impar");
/* =====Titulo===== */

/* =====Pular Linha===== */
document.write("<br>");
document.write("<br>");
/* =====Pular Linha===== */

/* =====Declarar Variáveis===== */
var num, res;
res = false;
/* =====Declarar Variáveis===== */

/* =====Printar Variáveis===== */
while (!res) {
  let num = parseInt(prompt("Teste 3 - Digite um número par ou impar"));
  if (isNaN(num)) {
    alert("Você precisa digitar um valor válido, tente de novo");
    continue;
  }
  if (num % 2 == 0) {
    document.write("O número " + num + " que você digitou é um número par");
  } else {
    document.write("O número " + num + " que você digitou é um número ímpar");
  }
  res = true;
}
/* =====Printar Variáveis===== */