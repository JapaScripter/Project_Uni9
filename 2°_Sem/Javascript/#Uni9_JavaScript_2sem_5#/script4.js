/* =====Colocar Linha===== */
document.write("<hr>");
/* =====Colocar Linha===== */

/* =====Titulo===== */
document.write("Teste 4 - Verifica Estado");
/* =====Titulo===== */

/* =====Pular Linha===== */
document.write("<br>");
document.write("<br>");
/* =====Pular Linha===== */

/* =====Declarar Variáveis===== */
var uf;
let estadosDoBrasil = [
  {"sigla": "AC", "nome": "Acre"},
  {"sigla": "AL", "nome": "Alagoas"},
  {"sigla": "AP", "nome": "Amapá"},
  {"sigla": "AM", "nome": "Amazonas"},
  {"sigla": "BA", "nome": "Bahia"},
  {"sigla": "CE", "nome": "Ceará"},
  {"sigla": "DF", "nome": "Distrito Federal"},
  {"sigla": "ES", "nome": "Espírito Santo"},
  {"sigla": "GO", "nome": "Goiás"},
  {"sigla": "MA", "nome": "Maranhão"},
  {"sigla": "MT", "nome": "Mato Grosso"},
  {"sigla": "MS", "nome": "Mato Grosso do Sul"},
  {"sigla": "MG", "nome": "Minas Gerais"},
  {"sigla": "PA", "nome": "Pará"},
  {"sigla": "PB", "nome": "Paraíba"},
  {"sigla": "PR", "nome": "Paraná"},
  {"sigla": "PE", "nome": "Pernambuco"},
  {"sigla": "PI", "nome": "Piauí"},
  {"sigla": "RJ", "nome": "Rio de Janeiro"},
  {"sigla": "RN", "nome": "Rio Grande do Norte"},
  {"sigla": "RS", "nome": "Rio Grande do Sul"},
  {"sigla": "RO", "nome": "Rondônia"},
  {"sigla": "RR", "nome": "Roraima"},
  {"sigla": "SC", "nome": "Santa Catarina"},
  {"sigla": "SP", "nome": "São Paulo"},
  {"sigla": "SE", "nome": "Sergipe"},
  {"sigla": "TO", "nome": "Tocantins"},
];
let estadoEncontrado = false;
/* =====Declarar Variáveis===== */

/* =====Printar Variáveis===== */
while (!estadoEncontrado) {
  uf = prompt("Teste 4 - Digite a sigla de um estado (somente 2 letras): ");
  uf = uf.toUpperCase();
  
  for (let i = 0; i < estadosDoBrasil.length; i++) {
    if (estadosDoBrasil[i].sigla === uf) {
      document.write("A sigla " + uf + " pertence ao estado de " + estadosDoBrasil[i].nome);
      estadoEncontrado = true;
      break;
    }
  }
  
  if (!estadoEncontrado) {
    alert("UF não existente, tente de novo.");
  }
}
/* =====Printar Variáveis===== */