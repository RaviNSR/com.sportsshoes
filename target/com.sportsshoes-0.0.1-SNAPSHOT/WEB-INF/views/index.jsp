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
 		<br>
 		
 		<div id="carousel1" class="carousel slide" data-ride="carousel">
      <ol class="carousel-indicators">
        <li data-target="#carousel1" data-slide-to="0" class="active"></li>
        <li data-target="#carousel1" data-slide-to="1"></li>
        <li data-target="#carousel1" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active"><img src="${pageContext.request.contextPath}/resources/images/carosole/1.jpg" alt="First slide image" class="center-block">
          <div class="carousel-caption">
            <h3>Fell As Fly</h3>
           
          </div>
        </div>
        <div class="item"><img src="${pageContext.request.contextPath}/resources/images/carosole/2.jpg" alt="Second slide image" class="center-block">
          <div class="carousel-caption">
            <h3>I can't concentrate in flats.</h3>
            
          </div>
        </div>
        <div class="item"><img src="${pageContext.request.contextPath}/resources/images/carosole/3.jpg" alt="Third slide image" class="center-block">
          <div class="carousel-caption">
            <h3>I still have my feet on the ground, I just wear better shoes</h3>
            
          </div>
        </div>
<div class="item"><img src="${pageContext.request.contextPath}/resources/images/carosole/4.jpg" alt="Second slide image" class="center-block">
          <div class="carousel-caption">
            <h3>I'm not afraid of heights, have you seen my shoes?</h3>
            
          </div>
        </div>
<div class="item"><img src="${pageContext.request.contextPath}/resources/images/carosole/5.jpg" alt="Second slide image" class="center-block">
          <div class="carousel-caption">
            <h3>A woman with good shoes is never ugly</h3>
            
          </div>
        </div>
<div class="item"><img src="${pageContext.request.contextPath}/resources/images/carosole/6.png" alt="Second slide image" class="center-block">
          <div class="carousel-caption car-re-posn">
           <h4>Keep your head, heels and standards high</h4>
                            
          </div>
        </div>
<div class="item"><img src="${pageContext.request.contextPath}/resources/images/carosole/7.png" alt="Second slide image" class="center-block">
          <div class="carousel-caption">
            <h3>I actually have more shoes than anyone will ever know</h3>
           
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#carousel1" role="button" data-slide="prev"><span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span><span class="sr-only">Previous</span></a><a class="right carousel-control" href="#carousel1" role="button" data-slide="next"><span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span><span class="sr-only">Next</span></a></div>
       
       
 <div class="feel-fall">
            <div class="container">
                <div class="pull-left fal-box">
                    <div class=" fall-left">
                        <h3>Fall</h3>
                        <img src="${pageContext.request.contextPath}/resources/images/f-l.png" alt="/" class="img-responsive fl-img-wid">
                        <p>Inspiration and innovation<br> for every athlete in the world</p>
                        <span class="fel-fal-bar"></span>
                    </div>
                </div>
                <div class="pull-right fel-box">
                    <div class="feel-right">
                        <h3>Feel</h3>
                        <img src="${pageContext.request.contextPath}/resources/images/f-r.png" alt="/" class="img-responsive fl-img-wid">
                        <p>Inspiration and innovation<br> for every athlete in the world</p>
                        <span class="fel-fal-bar2"></span>
                    </div>
                </div>
            <div class="clearfix"></div>
            </div>
        </div>
        
              <c:import url="/footer"/>	
</body>
</html>