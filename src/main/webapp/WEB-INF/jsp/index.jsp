<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Main</title>
    <link href='http://fonts.googleapis.com/css?family=PT+Sans:400,700,400italic,700italic&subset=latin,cyrillic' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>

    <script type="text/javascript" src="//vk.com/js/api/openapi.js?98"></script>
    <script type="text/javascript">
        VK.init({apiId: 3795826, onlyWidgets: true});
    </script>

    <script src="script/subscribe-button.js"> </script>
    <script>
    $(document).ready(function(){
        // появление/затухание кнопки #back-top
        $(function (){
            // прячем кнопку #back-top
            $("#back-top").hide();

            $(window).scroll(function (){
                if ($(this).scrollTop() > 100){
                    $("#back-top").fadeIn();
                } else{
                    $("#back-top").fadeOut();
                }
            });

            // при клике на ссылку плавно поднимаемся вверх
            $("#back-top a").click(function (){
                $("body,html").animate({
                    scrollTop:0
                }, 500);
                return false;
            });

        });


    });
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
            <form:form commandName="subscribeForm" id="subscribe-form" action="index.html">
                <div>
                    <div id="form-name"> <label>Подписка на рассылку</label> </div>  <div id="close"> x </div>
                    <div id="form-content"> <img src="img/mail.png">
                        <form:input path="email" placeholder="Введите свой e-mail" id="email-input" class="formSpace"/>
                    </div>
                    <div id="subscr-button-div"> <input type="submit" id ="submit-button-subscribe" value="Подписаться"/></div>
                </div>
            </form:form>
        </div>

       <div id="content">

            <c:forEach items="${events}" var="events">
                <div class="block">

                    <div > <img type="image/jpeg" class="img-block" src="${events.img}"> </div>
                    <div class="text-block">
                        <div class="event-name"><c:out value="${events.name}"/></div>
                        <!--div class="event-creator">новость добавил Mihail@1988</div-->
                        <div class="event-date"> <c:out value="${events.humanReadableDate}"/></div>
                        <div class="event-content"><c:out value="${events.description}"/></div>
                    </div>
                </div>
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
