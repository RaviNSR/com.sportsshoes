<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>

	<!-- Head-Meta Begin  -->
 		<c:import url="/head-meta"/>	
 	<!-- Head-Meta End -->

</head>

<body>
 		
 		<!-- Head Begin  -->
 		<c:import url="/head"/>	
 		<!-- Head End -->
 		
 		
 		<div class="reg-form">
		<div class="container">
			<div class="reg">
			
				<h3>Register Now</h3>
				
				<p><h4>Welcome, please enter the following details to continue.</h4></p>
				<p><h4>If you have previously registered with us, <a href="#">click here</a></p></h4>
				
				 <form method="post" action="Adduser" ModelAttribute="User">
				 
					<ul>
						<li ><b>First Name:<span style="color:red;">*</span> </b></li>
			
						<li><input title="Enter First Name" path="FIRTS_NAME" name ="FIRTS_NAME"  type="text" placeholder="First Name" required></li>
					</ul>
					<ul>
						<li ><b>Last Name:</b> </li>
						<li><input title="Enter Last Name" type="text" path="LAST_NAME" name = "LAST_NAME" placeholder="Last Name" required></li>
					 </ul>				 
					<ul>
						<li  ><b>Email:<span style="color:red;">*</span> </b></li>
						<li><input  title="Enter Email Address" type="text"  path="EMAIL" name="EMAIL"  placeholder="Email Id" pattern="[^ @]*@[^ @]*"required></li>
					</ul>
					<ul>
					
						<li ><b>Password:</b> </li>
						<li><input title="Enter New Password" type="password" path="PASSWORD" name="PASSWORD" placeholder="Password"  required></li>
					</ul>
					<ul>
						<li ><b>Confirmation Password</b></li>
						<li><input title="Enter Confirm Password" type="password" path="CONFIRMATION_PASSWORD"  name="CONFIRMATION_PASSWORD" placeholder="Confirmation Password"  required></li>
					</ul>
					
					<ul>
						<li ><b>Mobile Number:<span style="color:red;size=10;">*</span></b></li>
						<li><input title="Enter Mobile Number" type="text" path = "MOBILE_NUMBER" name = "MOBILE_NUMBER" placeholder="Mobie Number" maxlength="10" pattern="[0-9]{10}" required></li>
					</ul>	
					<div class="form-group">
    <span class="text-muted"><em><span style="color:red;">*</span> Indicates required field</em></span>
  </div>					
					<input type="submit" value="Register">
					<input type="Submit" value="Reset">
					<p class="click"><h4>By clicking this button, you are agree the<a href="#">Terms and Conditions</a></p> </h4>
				
				</form>
			</div>
		</div>
	</div>
 <c:import url="/footer"/>	
</body>
</html>