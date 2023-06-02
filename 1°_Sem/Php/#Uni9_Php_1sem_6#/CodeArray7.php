<?php
  $uf = array ("SP", "RJ", "MG", "ES", "SC", "RR", "DF", "PR");
    foreach ($uf as $valor){
    echo $valor."<hr>";
    }
  /*ambos os métodos dão no mesmo resultado*/
   $uf = array (
     0 => "SP",
     1 => "RJ",
     2 => "MG",
     3 => "ES",
     4 => "SC",
     5 => "RR",
     6 => "DF",
     7 => "PR");
    foreach ($uf as $valor){
    echo $valor."<hr>";
    } 
?>