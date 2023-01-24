<%-- 
    Document   : agecalculator
    Created on : 24-Jan-2023, 10:17:24 AM
    Author     : mdkul
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
            Enter your age:<input type="text" name="theAge" value='${theAge}'><br>
            <input type="submit" value="Age next Birthday"><br>
            ${theAgeI}<br>
            <a href="###">Arithmetic Calculator</a>
        </form>
    </body>
</html>
