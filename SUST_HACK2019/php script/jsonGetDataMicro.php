<?php

   	$servername = "localhost";
      $username = "id9331775_eesha";
      $password = "eesha";
      $database = "id9331775_microinlo";

   $con=mysqli_connect($servername,$username,$password,$database);


   $sql="SELECT * FROM cusmoters;";

   $result=mysqli_query($con,$sql);

   $response=array();

   while($row=mysqli_fetch_array($result))
   {
      array_push($response, array("user_name"=>$row[0],"user_motherName"=>$row[1], "user_fatherName"=>$row[2], "user_dateBirth"=>$row[3], "user_nid"=>$row[4], "user_fingerprint"=>$row[5], "user_rating"=>$row[6], "user_image"=>$row[7], "user_parmanentAddress"=>$row[8], "user_bloddGroup"=>$row[9], "user_mobile"=>$row[10],"user_password"=>$row[11]) );
   }

   echo json_encode(array("server_response"=>$response));

   mysqli_close($con);

?>