<?php

   require "connectorMicro.php";

   $user_name = $_POST['user_name'];
   $user_motherName = $_POST['user_motherName'];
   $user_fatherName = $_POST['user_fatherName'];
   $user_dateBirth = $_POST['user_dateBirth'];
   $user_nid = $_POST['user_nid'];
   $user_parmanentAddress = $_POST['user_parmanentAddress'];
   $user_bloddGroup = $_POST['user_bloddGroup'];
   
   $user_mobile = false;

   if(isset($_POST['user_mobile'])){
    $user_mobile = $_POST['user_mobile'];
   }

   $sql="INSERT INTO customers (user_name, user_motherName, user_fatherName, user_dateBirth, user_nid, user_parmanentAddress, user_bloddGroup, user_mobile) 
   VALUES ('$user_name','$user_motherName','$user_fatherName','$user_dateBirth','$user_nid','$user_parmanentAddress','$user_bloddGroup','$user_mobile');";

   if (mysqli_query($con,$sql)) {
      echo "<br> <h3> Values have been inserted successfully</h3> ";
   }

   else{
      echo "Error in insertion" . mysqli_error($con);
   }

?>