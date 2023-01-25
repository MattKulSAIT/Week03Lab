<%-- 
    Document   : arithmeticcalculator
    Created on : 24-Jan-2023, 6:30:02 PM
    Author     : mdkul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="age" method="post">
            First: <input type="text" name="firstVal" value='${firstVal}'><br>
            Second: <input type="text" name="secondVal" value='${secondVal}'><br>
            <input type="submit" name="math" value="+">
            <input type="submit" name="math" value="-">
            <input type="submit" name="math" value="*">
            <input type="submit" name="math" value="%"><br>
            Result:${theValue}<br>
            <a href="age">Age Calculator</a>
    </body>
</html>
