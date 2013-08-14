<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<!doctype html>
<html>
<head>
   <title>Главная страница</title>
   <jsp:include page="/WEB-INF/jsp/lay-out/head.jsp"/>

 <script type="text/javascript" src="//vk.com/js/api/openapi.js?98"></script>
    <script type="text/javascript">
      VK.init({apiId: 3795826, onlyWidgets: true});
    </script>
</head>
<body>
<div id="wrap">

   <jsp:include page="/WEB-INF/jsp/lay-out/top-of-page.jsp"/>
   <div id="vk_like" class="vk_like"></div>
       <script type="text/javascript">
           VK.Widgets.Like("vk_like", {type: "mini", height: 20, pageImage:"${event.img}"});
       </script>
   <div id="content">
               <c:forEach items="${events}" var="events">
                   <a href="event.html?id=${events.id}">
                       <div id="event-block" class="block">
                           <div > <img type="image/jpeg" class="img-block" src="${events.img}"> </div>
                           <div class="text-block">
                               <div class="event-name"><c:out value="${events.name}"/></div>
                               <!--div class="event-creator">новость добавил <c:out value="${events.id}"/></div-->
                               <div class="event-date"> <c:out value="${events.humanReadableDate}"/></div>
                               <div class="event-content"><c:out value="${events.description}"/></div>
                           </div>
                       </div>
                   </a>
               </c:forEach>
          </div>
       </div>
</div>
    <jsp:include page="/WEB-INF/jsp/lay-out/footer.jsp"/>
</body>
</html>
