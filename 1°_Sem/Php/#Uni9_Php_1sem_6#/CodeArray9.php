<?php
  $nomes = array("Fulano", "Beltrano", "Hebert", "Sicrano", "Astrogildo", "Julia", "Marcela", "Bruno", "Arthur", "Cleiton", "Ryan");
  $total = count($nomes); $ult = count($nomes)-1;
    echo "Foram encontradas $total nomes no array.<br>";
    echo "<hr>";
    echo "Primeiro valor do array: ".$nomes[0]."<br>";
    echo "<hr>";
    echo "Último valor do array: ".$nomes[$ult];
    echo "<hr>";
    for($i = 0; $i<$total; $i++){
      echo $nomes[$i]."<br>";
    }
    echo "<hr>";
    echo $nomes[count($nomes)-1];
    echo "<hr>";
?>