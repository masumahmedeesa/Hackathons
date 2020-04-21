<?php

      $servername = "localhost";
      $username = "id9331775_eesha";
      $password = "eesha";
      $database = "id9331775_microinlo";

   $con=mysqli_connect($servername,$username,$password,$database);

   // $user_mobile= '01701062056';
    
   $sql="SELECT * FROM investment;";

   $result=mysqli_query($con,$sql);

   $response=array();

   while($row=mysqli_fetch_array($result))
   {
      array_push($response, array("user_mobile"=>$row[0],"invest_transaction"=>$row[1], "invest_amount"=>$row[2], "invest_date"=>$row[3],"invest_time"=>$row[4]));
   }

   echo json_encode(array("server_response"=>$response));

   mysqli_close($con);

?>