<?php

   	$servername = "localhost";
      $username = "id9331775_testy";
      $password = "testy";
      $database = "id9331775_testy";

   $con=mysqli_connect($servername,$username,$password,$database);


   $sql="SELECT * FROM users;";

   $result=mysqli_query($con,$sql);

   $response=array();

   while($row=mysqli_fetch_array($result))
   {
      array_push($response, array("name"=>$row[0],"email"=>$row[1], "phone"=>$row[2]) );
   }

   echo json_encode(array("server_response"=>$response));

   mysqli_close($con);

?>