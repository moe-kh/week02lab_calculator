<%-- 
    Document   : agecalculator
    Created on : Jan 20, 2020, 1:38:30 PM
    Author     : 794456
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <label>Enter your age:</label>
            <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
            
        </form>
        ${msg}
        <br>
        <a href="arithmetic">Arithmetic Calculator</a>
        
    </body>
</html>
