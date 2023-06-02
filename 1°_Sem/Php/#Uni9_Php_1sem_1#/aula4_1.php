<?php
  $nota1=8;
  $nota2=9;
  $media=($nota1 + $nota2)/2;
  echo "media = ".$media;
  if ($media>=7)
    {
      echo "<h1 style=color:blue>APROVADO</h1>";
    }
    else{
        echo "<h1 style=color:red>REPROVADO</h1>";
        };
?>