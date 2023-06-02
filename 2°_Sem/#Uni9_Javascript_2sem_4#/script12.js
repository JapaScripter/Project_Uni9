/* =====Colocar Linha===== */
document.write("<hr>");
/* =====Colocar Linha===== */

/* =====Titulo===== */
document.write("Teste 12 - Inclusão de login e senha");
/* =====Titulo===== */

/* =====Pular Linha===== */
document.write("<br>");
/* =====Pular Linha===== */

/* =====Declarar Variáveis===== */
var usuario, usu, senha, senh, res;
/* =====Declarar Variáveis===== */

/* =====Printar Variáveis===== */
while (true) {
	usu = prompt("Teste 12 - Digite o nome de login (admin)");
	senh = prompt("Teste 12 - Digite a senha padrão para acessar (1234)");
	usuario = "admin";
	senha = "1234";
	if (usu == usuario && senh == senha) {
		alert("Você é o admin, acesso liberado");
		document.write("<br>Você realmente é o admin, parabéns!");
		break;
	} else {
		alert("Você digitou o login ou a senha errada, tente de novo");
	}
}
/* =====Printar Variáveis===== */