<?php
if(count($_POST)==0){
exit("<h1>Sem acesso!</h1>");
}
$txt_nome=filter_input(INPUT_POST, "txt_nome", FILTER_SANITIZE_FULL_SPECIAL_CHARS);
$num_ra=filter_input(INPUT_POST, "num_ra", FILTER_SANITIZE_FULL_SPECIAL_CHARS);
$txt_senha=filter_input(INPUT_POST, "txt_senha", FILTER_SANITIZE_FULL_SPECIAL_CHARS);
echo "Nome: $txt_nome<br>";
echo "RA: $num_ra<br>";
echo "Seha: *****<br>";
?>