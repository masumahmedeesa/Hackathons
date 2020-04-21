<!DOCTYPE html>
<html>
<head>
	<title> Add info </title>
</head>
<body>

	<form action="insert.php" method="post">

		<table>
			<tr>
				<td> Name : </td>
				<td> <input type="text" name="name"/> </td>
			</tr>

			<tr>
				<td> Email : </td>
				<td> <input type="text" name="email"/> </td>
			</tr>

			<tr>
				<td> Phone : </td>
				<td> <input type="text" name="phone"/> </td>
			</tr>

		</table>
	<input type="submit" name="save_data"/>
	</form>
</body>
</html>