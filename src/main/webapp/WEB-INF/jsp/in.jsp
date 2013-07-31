<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>Подписчики</title>
    </head>
    <body>
        <!--h2><c:out value="${events}"/></h2-->
        <!--table>
            <thead>
                <tr>
                    <td>description</td>
                </tr>
                <tr>
                    <td>name</td>
                </tr>
            </thead>
            <c:forEach items="${events}" var="events">
            <tr>
                <td><c:out value="${events.description}"/></td>
            </tr>
            <tr>
                <td><c:out value="${events.name}"/></td>
            </tr>
            </c:forEach>
        </table-->
        <c:forEach items="${events}" var="events">
        <div class="block">

        <div > <img class="img-block" src="img/1event.jpg"> </div>
        <div class="text-block">
        <div class="event-name"><c:out value="${events.name}"/></div>
        <div class="event-creator">новость добавил Mihail@1988</div>
        <div class="evenr-conent"><c:out value="${events.description}"/></div>
        </div>

        </div>
        </c:forEach>
    </body>
</html>