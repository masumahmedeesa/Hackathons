<?php

$servername = "localhost";
$username = "id9331775_testy";
$password = "testy";
$database = "id9331775_testy";

   $con=mysqli_connect($servername,$username,$password,$database);

   $sql="CREATE TABLE table1(Username CHAR(30),Password CHAR(30),Role CHAR(30))";
   if (mysqli_query($con,$sql)) {
      echo "Table have been created successfully";
   }

?>