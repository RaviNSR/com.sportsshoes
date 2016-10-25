<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
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

<div class="login">
            <div class="container">
                <div class="login-grids">
                    <div class="col-md-6 log">
                             <h3>Login</h3>
                             <div class="strip"></div>
                             <p>Welcome, please enter the following to continue.</p>
                             
                             <form method="post" action="login">
                                 <h5><b>User Name:</b></h5>	
                                 <input pattern="[A-Za-z]{10}" title="Enter Username" type="text" placeholder="User Name" required>
                                 <h5><b>Password:</b></h5>
                                 <input  title="Enter Password"type="password"  placeholder="Password" required ><br>					
                                 <input type="submit" value="Login">
                                 
                                 </form>

                            <a href="#">Forgot Password ?</a>
                    </div>
                    
                </div>
            </div>
        </div>    
           
</body>
</html>