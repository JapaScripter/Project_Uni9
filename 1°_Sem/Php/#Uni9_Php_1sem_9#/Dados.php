<html>
  <head>
  <link rel="stylesheet" type="text/css"
  </head>
  <body bgcolor="black">
    <?php
      echo "<pre>";print_r($_POST);echo "</pre>";
      $txt_nome = $_POST["txt_nome"];
      $txt_sobrenome = $_POST["txt_sobrenome"];
      $txt_cidade = $_POST["txt_cidade"];
      $txt_estado = $_POST["txt_estado"];
      $txt_idade = $_POST["txt_idade"];
      echo "Bem Vindo"
    ?>
  </body>
</html>