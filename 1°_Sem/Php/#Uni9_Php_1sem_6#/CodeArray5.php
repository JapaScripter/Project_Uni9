<?php
  $aluno = array(
    "curso" => "TADS",
    "nome" => "Fulano",
    "ra" => 123456789);
    echo "<pre>"; print_r($aluno); echo "</pre>";
    echo "<hr>Nome: ".$aluno["nome"];
    echo "<br>Ra: ".$aluno["ra"];
    echo "<br>Curso: ".$aluno["curso"];
?>