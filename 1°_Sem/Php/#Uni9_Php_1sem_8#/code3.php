<?php
function media3($valor1, $valor2, $valor3) {
 $total = ($valor1 + $valor2 + $valor3)/3;
 return number_format($total, 2, ',', '.');
 
}
echo media3(10,7,8);//
$x=media3(70000000,7,7);//
echo "<br>x=$x";
?>