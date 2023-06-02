<?php
function boas_vindas(){

  echo "<h1>Seja bem vindo(a), ".$GLOBALS["alguem"]."!</h1>";
}
 $alguem="Roberta";
boas_vindas();
//$GLOBALS["alguem"]
?>