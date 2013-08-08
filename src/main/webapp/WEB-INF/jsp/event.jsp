<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>Подписчики</title>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <script type="text/javascript">

        </script>
    </head>
    <body>
        <h1>EVENT PAGE</h1>
        <div class="block">
            <div class="text-block">
                <div class="event-name"><c:out value="${event.name}"/></div>
                <div class="event-creator"><c:out value="${event.img}"/></div>
                <div class="event-creator"><img class="img-block" src="${event.img}"></div>
                <div class="event-conent"><c:out value="${event.description}"/></div>
            </div>
        </div>

    </body>
</html>