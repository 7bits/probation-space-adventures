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
                <td><c:out value="${events.img}"/></td>
            </tr>
            <tr>
                <td><c:out value="${events.name}"/></td>
            </tr>
            </c:forEach>
        </table-->
        <c:forEach items="${events}" var="events">
        <div class="block">

        <div > <img class="img-block" src="${pageContext.request.contextPath}/space_adventure/img/eventsImg/1event.jpg"> </div>
        <div > <img class="img-block" src="${pageContext.request.contextPath}/src/main/webapp/img/1event.jpg"> </div>
        <div class="text-block">
        <div class="event-name"><c:out value="${events.name}"/></div>
        <div class="event-creator"><c:out value="${events.img}"/></div>
        <div class="event-creator"><img class="img-block" src="${events.img}"></div>
        <div class="evenr-conent"><c:out value="${events.description}"/></div>

        </div>

        </div>
        </c:forEach>
    </body>
</html>