<?php

   require "connectorMicro.php";
   

      $invest_transaction = $_POST['invest_transaction'];
      $invest_amount = $_POST['invest_amount'];

      $sql = " SELECT user_name from customers where user_mobile IN(
               SELECT user_mobile from investment where invest_transaction='$invest_transaction' and invest_amount='$invest_amount');";

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