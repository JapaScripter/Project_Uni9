/* =====Colocar Linha===== */
document.write("<hr>");
/* =====Colocar Linha===== */

/* =====Titulo===== */
document.write("Teste 11 - Inclusão de senha");
/* =====Titulo===== */

/* =====Pular Linha===== */
document.write("<br>");
/* =====Pular Linha===== */

/* =====Declarar Variáveis===== */
var senha, passw;
/* =====Declarar Variáveis===== */

/* =====Printar Variáveis===== */
while (true) {
	senha = prompt("Teste 11 - Digite a senha padrão para acessar (1234)");
	passw = "1234";
	if (senha == passw) {
		alert("Você digitou a senha correta, acesso liberado");
		document.write("<br>Você acertou a senha 1234, parabéns!");
		break;
	} else {
		alert("Você digitou a senha errada, tente de novo");
	}
}
/* =====Printar Variáveis===== */