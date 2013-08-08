<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
    <head>
        <title>Подписчики</title>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
        <script type="text/javascript" src="//vk.com/js/api/openapi.js?98"></script>
        <script type="text/javascript">
            VK.init({ apiId: 3795826, onlyWidgets: true });
        </script>
    </head>
    <body>
        <h1>EVENT PAGE</h1>
        <!-- Put this div tag to the place, where the Like block will be -->
        <div id="vk_like"></div>
        <script type="text/javascript">
            VK.Widgets.Like("vk_like", {type: "mini", height: 20, pageImage:"${event.img}"});
        </script>

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