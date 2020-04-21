<?php

   	$servername = "localhost";
      $username = "id9331775_eesha";
      $password = "eesha";
      $database = "id9331775_microinlo";

   $con=mysqli_connect($servername,$username,$password,$database);
   
   $sql= "SELECT * FROM loan;";

   $result=mysqli_query($con,$sql);

   $response=array();

   while($row=mysqli_fetch_array($result))
   {
      array_push($response, array("user_mobile"=>$row[0],"loan_transaction"=>$row[1], "loan_amount"=>$row[2], "loan_date"=>$row[3], "loan_time"=>$row[4]);
   }

   echo json_encode(array("server_response"=>$response));

   mysqli_close($con);

?>