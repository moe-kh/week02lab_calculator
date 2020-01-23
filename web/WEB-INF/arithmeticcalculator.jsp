<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 20, 2020, 7:08:55 PM
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
         <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label>First:</label>
            <input type="text" name="first" value="${f}"><br>
            <label>Second:</label>
            <input type="text" name="second" value="${s}"><br>
            <input type="submit" value="+" name="add">
            <input type="submit" value="-" name="sub">
            <input type="submit" value="*" name="mul">
            <input type="submit" value="%" name="mod">
            
        </form>
          <label>Result:</label>
          ${msg}
         <br>
         
         <a href="age">Age Calculator</a>
    </body>
</html>
