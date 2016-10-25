<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
   <%@page isELIgnored="false"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     <c:import url="/head-meta"/>	
</head>
<body>
      <c:import url="/head"/>
      
       <div class="contact">
            <div class=container>
                <h3 align="center">Catch us</h3>
                <div class="contact-content">
                    <form>
                        <input type="text" class="textbox" value=" Your Name" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Your Name';}"><br>
                        <input type="text" class="textbox" value="Your E-Mail" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Your E-Mail';}"><br>
                            <div class="clear"> </div>
                        <div>
                            <textarea value="Message:" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Your Message ';}">Your Message</textarea><br>
                        </div>	
                       <div class="submit"> 
                            <input class="btn btn-default cont-btn" type="submit" value="SEND " align="middle"/>
                      </div>
                    </form>
                    </div></div></div> 
                    
                     <c:import url="/footer"/>	
</body>
</html>