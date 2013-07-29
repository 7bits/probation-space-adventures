<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
    <head>
        <title>Hello Spring MVC</title>
    </head>

    <body>
        <h2>${message}</h2>
        <!--Экранированный вывод-->
        <h2><c:out value="${message}"/></h2>
    </body>
</html>