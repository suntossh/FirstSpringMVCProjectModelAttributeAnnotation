<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FirstSpringMVCProjectRequestParamAnnotation</title>
<h1>${headString}</h1>
<h1>${messageString}</h1>
</head>
<body>
	<form action="/FirstSpringMVCProjectModelAttributeAnnotation/submitAdmissionForm.html" method="post">

		<tr>
			<td>Student's Name : </td><td>        <input type="text" name="studentName" /></td>
		</tr>
		<tr>
			<td>Student's Hobby : </td><td>       <input type="text" name="studentHobby" /></td>
		</tr>
	
			<tr>
			<td>Student's Mobile : </td><td>      <input type="text" name="studentMobile" /></td>
		</tr>
		<tr>
			<td>Student's DOB : </td><td>     	   <input type="text" name="studentDOB" /></td>
		</tr>
		<tr>
			<td>Student's Skills set :</td><td>    <select name="studentSkills" multiple>
													<option value="Java Core">Java Core</option>
													<option value="Spring Core">Spring Core</option>
													<option value="Spring MVC">Spring MVC</option>
													</select><td>
		</tr>
		
		<input type="submit" value="Submit this form by clicking here" />
	</form>
</body>
</html>