<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>
    <form action="addAlien">
        <input type="text" name="id"><br>
        <input type="text" name="name"><br>
        <input type="text" name="tech"><br>
        <input type="submit"><br>
    </form>

    <form action="getAlien">
        <input type="text" name="id"><br>
        <input type="submit"><br>
    </form>

    <form action="showAliensList">
        <input type="submit" value="Show list">
    </form>
    ${aliens}
</body>
</html>