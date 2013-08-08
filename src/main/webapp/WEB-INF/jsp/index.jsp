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
    <script src="/space_adventures/resources/script/subscribe-button.js"> </script>
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
            <div id="logo"> Space adventure </div>
            <div id="top-menu">
                Главная	 &nbsp;&nbsp;&nbsp;&nbsp;  Добавить событие &nbsp;&nbsp;&nbsp;&nbsp; Регистрация &nbsp;&nbsp;&nbsp;&nbsp;  Вход
            </div>
        </div>
    </div>
    <!--a href="javascript:scroll(0,0)" ><div id="go-top"> </div> </a-->
    <p id="back-top"><a href="#top"><span> <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br> ВВЕРХ </span></a></p>

    <div id="container" class="container centr">
        <header>
            <div id="zagolovok">Узнавай о событиях космоса и спеши наблюдать</div>
            <span id="please-subs">Подпишись на рассылку и получай информацию о надвигающихся событиях космоса.</span>
            <div>
                <button id="subs-button"> Подписка на рассылку</button>
            </div>
            <div id="vk_like"></div>
            <script type="text/javascript">
                VK.Widgets.Like("vk_like", {type: "mini", height: 20, pageUrl:"google.ru"});
            </script>

        </header>
        <!--div id="filtr">
            <div id="admin" title="Вывести сообщения добавленные админом">
                <input type="checkbox" name="filtr" value="admin">
            </div>
            <div id="user" title="Вывести сообщения добавленные пользователем">
                <input type="checkbox" name="filtr" value="user" >
            </div>
        </div-->


        <div id="subscribe-form-div">

        </div>

        <div id="error">

        </div>

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
