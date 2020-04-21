<?php
$servername = "localhost";
$username = "id9331775_testy";
$password = "testy";
$database = "id9331775_testy";

   $con=mysqli_connect($servername,$username,$password,$database);

   if (mysqli_connect_errno($con)) {
      echo "Failed to connect to MySQL: " . mysqli_connect_error();
   }
   else
   	echo "Success!";

?>