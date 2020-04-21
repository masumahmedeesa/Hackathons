<?php

   require "connectorMicro.php";
   
   //ob_start();

      $user_mobile = $_POST['user_mobile'];
      $user_password = md5($_POST['user_password']);

      $sql = "SELECT * from users where user_mobile='$user_mobile';";

      $result = mysqli_query($con,$sql);

      if (!mysqli_num_rows($result)>0)
      {
         
         $sql2="INSERT INTO users (user_mobile, user_password) 
               VALUES ('$user_mobile','$user_password');";
         if (mysqli_query($con,$sql)) {
                  echo "1";
            }
         else{
                  echo "Error in insertion" . mysqli_error($con);
            }
         
      
      } 

      else
      {
         echo "0";

      }

      mysqli_close($con);

?>