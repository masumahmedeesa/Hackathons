<?php

   require "connectorMicro.php";
   
   //ob_start();

      $user_mobile = $_POST['user_mobile'];
      $user_password = md5($_POST['user_password']);

      $sql = " SELECT user_name from customers where user_mobile IN (SELECT user_mobile from users where user_mobile='$user_mobile' and user_password='$user_password') ;";

      $result = mysqli_query($con,$sql);

      if (!mysqli_num_rows($result)>0)
      {
         //$status = "failed";
         
         echo "0";
         //$status=['failInfo' => 'failed'];
         
         //$status["logInfo"]= "failed";

         //echo json_encode(array("response"=> $status));
         //echo json_encode($status);
      } 

      else
      {
         $row = mysqli_fetch_assoc($result);
            
        
         $user_name = $row['user_name'];
         echo $user_name;

      }

      mysqli_close($con);

?>