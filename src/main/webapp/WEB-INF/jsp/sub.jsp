<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>Подписчики</title>
    </head>
    <body>
        <h3>Подписки</h3>
         <c:forEach items="${subscriptions}" var="user">
        <!--<a href="<c:url value="/addSubscription.html"/>">Добавить подписчика</a>

        //Email <h2><c:out value="${message}"/></h2>

         <table>
         <thead>
         <tr>
             <td>E-mail</td>
         </tr>
         </thead>
             <c:forEach items="${subscriptions}" var="user">
                <tr>
                    <td><a href="mailto:${user.email}">${user.email}</a></td>
               </tr>
           </c:forEach>
         </table>  -->
    </body>
</html>