<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>

 <nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#defaultNavbar1"><span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
          <a class="navbar-brand" href="${pageContext.request.contextPath}/index">SportsShoes</a></div>
          
        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="defaultNavbar1">
          <ul class="nav navbar-nav">
          
            
           
          </ul>
         
          <ul class="nav navbar-nav navbar-right">
          <li><a href="${pageContext.request.contextPath}/index"><span class="glyphicon glyphicon-home"></span>Home</a></li>
            <li><a href="${pageContext.request.contextPath}/aboutus"><span class="glyphicon glyphicon-info-sign"></span>AboutUs</a></li>
             <li><a href="${pageContext.request.contextPath}/contactus"><span class="glyphicon glyphicon-envelope"></span>ContactUs</a></li>  
            <li><a href="${pageContext.request.contextPath}/product"><span class="glyphicon glyphicon-gift"></span>Products</a></li>
      		
      		<c:choose>
  				<c:when test="${not empty pageContext.request.userPrincipal}">
  				<li id="p04"><h3>${pageContext.request.userPrincipal.name}</h3></li>
  				<li id="p04"><a href="${pageContext.request.contextPath}/logout">Log Out</a></li>
  			</c:when>
  	
  			<c:otherwise>
  				<li id="p04"><a href="${pageContext.request.contextPath}/register"><span class="glyphicon glyphicon-user"></span>Register</a></li>
  				<li id="p04"><a href="${pageContext.request.contextPath}/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
  			</c:otherwise>
  		
  	</c:choose>
      		
   </ul>
        </div>
        <!-- /.navbar-collapse -->
      </div>
      <!-- /.container-fluid -->
  </nav>