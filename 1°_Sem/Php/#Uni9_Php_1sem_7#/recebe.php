<?php
  echo "count: ".counts($_POST);
  if (count($_POST)==0){
    exit("<h1>Sem Acesso! </h1>");
  }
  foreach($_POST as $post => $valor){
    $$pos = $valor;
  }
  echo "Nome $txt_nome!<br>";
  echo "RA $num_ra!<br>";
  echo "Senha: ******!<br>";echo "Enviar: $Enviar";
  echo "<pre>" ;print_r($GLOBALS) ;echo "</pre>";
?>