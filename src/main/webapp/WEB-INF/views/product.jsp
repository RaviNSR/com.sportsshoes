<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<c:import url="/head-meta"/>
</head>
<body>

        <!-- Head Begin  -->
 		<c:import url="/head"/>	
 		 <script type="text/javascript">
	
	var myApp = angular.module('myApp',[]);
	
	myApp.controller("abc",function($scope)
	{
	
		$scope.data = ${JSONData};
		$scope.searchKeyword = '${param.search}';
	});
	
	
	</script>
    
    
    <body ng-app="myApp" ng-controller="abc">
      
    <div class="container">
    
    <div class="col-lg-12">Search
    			<input type="text" id="search" value="" placeholder="Enter Search Keyword..." class="form-control" ng-model="searchKeyword" />
    		</div>
    		
    		<br>
    		<br>
    		<br>
    		<br>
    
    	<div class="row" ng-repeat="x in data| filter: searchKeyword">
    	<br>
    		<div class="col-lg-4">
    			<img src="resources/images/{{x.ProductImage}}"></img>
    		</div>
    		<div class="col-lg-4">
    			<table class="table table-responsive">
    				<tr>
    					<td>Product Name:</td>
    					<td>{{x.ProductName}}</td>
    				</tr>
    				
    			</table>
    		</div>
    		<div class="col-lg-4">
    			<a href="${pageContext.request.contextPath}/viewproduct/{{x.ProductId}}" class="btn btn-success">View</a>
    			<a href="${pageContext.request.contextPath}/viewproduct/{{x.ProductId}}" class="btn btn-danger">Add to Cart</a>    			 			
    		</div>
    	</div>
    </div></body>	
</html>