<?php
function boas_vindas1() {
 $quem=isset($GLOBALS["alguem"])?$GLOBALS["alguem"]:"você mesmo";
//ternário: condição ? valor_verd : valor_falso
 echo "<h1>Seja bem vindo(a), ".$GLOBALS["alguem"]."!!!</h1>";
 }
//$alguem="Roberta"; 
$x=isset($GLOBALS["alguem"]);
var_dump($x);
//boas_vindas1();
?>