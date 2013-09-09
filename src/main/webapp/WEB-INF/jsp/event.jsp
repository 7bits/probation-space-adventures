<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<!doctype html>
<html>
<head>
    <title><c:out value="${event.name}"/></title>
    <jsp:include page="/WEB-INF/jsp/lay-out/head.jsp"/>

    <script src="/space_adventures/resources/js/back-button-create.js"> </script>

</head>
<body>

     <div id="wrap">

        <jsp:include page="/WEB-INF/jsp/lay-out/top-of-page.jsp"/>

        <div id="content">

            <div class="single-block">
                <div class="single-text-block">
                    <div class="single-event-title">
                        <div class="single-event-name"><c:out value="${event.name}"/></div>
                        <div class="single-event-date"> <c:out value="${event.humanReadableDate}"/></div>
                        <div id="vk_like" class="single-vk_like"></div>
                                    <script type="text/javascript">
                                        VK.Widgets.Like("vk_like", {type: "mini", height: 20, pageImage:"${event.img}"});
                                    </script>
                    </div>
                    <div class="single-event-img"><img class="single-img-block" src="${event.img}"></div>
                    <div class="single-event-content"><c:out value="${event.description}"/></div>

                    <div id="single-block-footer">
                            <div id="vk_like2" class="single-vk_like"></div>
                                <script type="text/javascript">
                                    VK.Widgets.Like("vk_like2", {type: "mini", height: 20, pageImage:"${event.img}"});
                                </script>
                     </div>
                </div>
            </div>
          </div>

          <div id="vk_comments" class="vk_comments"></div>
          <script type="text/javascript">
          VK.Widgets.Comments("vk_comments", {limit: 15, width: "700", attach: "photo,video,audio"});
          </script>*

       </div>
    </div>

    <jsp:include page="/WEB-INF/jsp/lay-out/footer.jsp"/>
</body>
</html>
