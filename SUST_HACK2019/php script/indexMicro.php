<!DOCTYPE html>
<html>
<head>
	<title> Add information of Micro Investment and Loan </title>
</head>
<body>

	<form action="insert.php" method="post">

		<table>
			<tr>
				<td> user_name : </td>
				<td> <input type="text" name="user_name"/> </td>
			</tr>

			<tr>
				<td> user_motherName : </td>
				<td> <input type="text" name="user_motherName"/> </td>
			</tr>


			<tr>
				<td> user_fatherName : </td>
				<td> <input type="text" name="user_fatherName"/> </td>
			</tr>
			

			<tr>
				<td> user_dateBirth : </td>
				<td> <input type="date" name="user_dateBirth"/> </td>
			</tr>
			

			<tr>
				<td> user_nid : </td>
				<td> <input type="text" name="user_nid"/> </td>
			</tr>
			

			<tr>
				<td> user_fingerprint : </td>
				<td> <input type="text" name="user_fingerprint"/> </td>
			</tr>
			

			<tr>
				<td> user_rating : </td>
				<td> <input type="number" name="user_rating"/> </td>
			</tr>

			<tr>
				<td> user_image : </td>
				<td> <input type="text" name="user_image"/> </td>
			</tr>

			<tr>
				<td> user_parmanentAddress : </td>
				<td> <input type="text" name="user_parmanentAddress"/> </td>
			</tr>

			<tr>
				<td> user_bloddGroup : </td>
				<td> <input type="text" name="user_bloddGroup"/> </td>
			</tr>
			
			<tr>
				<td> user_mobile : </td>
				<td> <input type="text" name="user_mobile"/> </td>
			</tr>

			<tr>
				<td> user_password : </td>
				<td> <input type="password" name="user_password"/> </td>
			</tr>

		</table>
	<input type="submit" name="save_data"/>
	</form>
</body>
</html>