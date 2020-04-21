<?php
$servername = "localhost";
$username = "id9331775_eesha";
$password = "eesha";
$database = "id9331775_microinlo";

   $con=mysqli_connect($servername,$username,$password,$database);

   if (mysqli_connect_errno($con)) {
      echo "Failed to connect to MySQL: " . mysqli_connect_error();
   }
   else
   	echo "Success!";

?>