<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>

<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Main</title>
    <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700,400italic,700italic&subset=latin,cyrillic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="/space_adventures/resources/css/style.css" type="text/css" media="screen" />

    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript" src="//vk.com/js/api/openapi.js?98"></script>
    <script src="/space_adventures/resources/script/insert-form.js"> </script>
    <script src="/space_adventures/resources/script/button-scroll-top.js"> </script>
    <script src="/space_adventures/resources/script/jquery.form.js"> </script>
    <script src="/space_adventures/resources/script/form-actions.js"> </script>

    <script type="text/javascript">
            VK.init({apiId: 3795826, onlyWidgets: true});
    </script>

</head>
<body>
    <div id="top-line">
        <div id="top-container" class="top-container centr">
            <a id="main-href" href="index.html"> <div id="logo"> Space adventure </div> </a>
            <div id="top-menu">
                Главная	 &nbsp;&nbsp;&nbsp;&nbsp;  Добавить событие &nbsp;&nbsp;&nbsp;&nbsp; Регистрация &nbsp;&nbsp;&nbsp;&nbsp;  Вход
            </div>
        </div>
    </div>
    <!--a href="javascript:scroll(0,0)" ><div id="go-top"> </div> </a-->
    <p id="back-top"><a href="#top"><span> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> ВВЕРХ </span></a></p>

    <div id="single-container" class="container centr">
        <!--header>

            <span id="single-please-subs">Подпишись на рассылку и получай информацию о надвигающихся событиях космоса.</span>
            <div>
                <button id="subs-button"> Подписка на рассылку</button>
            </div>


        </header-->

        <div id="subscribe-form-div">

        </div>

        <div id="error">

        </div>

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
   </div>

<div id="footer">
<div id="top-container" class="top-container centr">
<div id="logo">  Space adventure </div>
<div id="top-menu">
copyright (c)       |       contacts
</div>
</div>
</div>
</body>
</html>
