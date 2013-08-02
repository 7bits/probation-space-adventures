<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Main</title>
    <link href='http://fonts.googleapis.com/css?family=PT+Sans' rel='stylesheet' type='text/css'>
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

                    <div > <img class="img-block" src="${events.img}"> </div>
                    <div class="text-block">
                        <div class="event-name"><c:out value="${events.name}"/></div>
                        <!--div class="event-creator">новость добавил Mihail@1988</div-->
                        <div class="event-date"> <c:out value="${events.humanReadableDate}"/></div>
                        <div class="event-content"><c:out value="${events.description}"/></div>
                    </div>
                </div>
            </c:forEach>

            <!--div class="block">
 
                <div > <img class="img-block" src="img/1event.jpg"> </div>
                <div class="text-block">
                    <div class="event-name">Астероид</div>
                    <div class="event-creator">новость добавил Mihail@1988</div>
                    <div class="event-date"> Дата</div>
                    <div class="event-content">На этой неделе Меркурий достигнет наибольшей вечерней элонгации в 18°, а главным событием неба станет близкий пролет околоземного астероида 2012 DA14 (+7m) в ночь с 15 на 16 февраля. Сатурн наблюдаются на ночном и утреннем небе, Юпитер виден с вечера до ночи, Уран - на вечернем небе, а Меркурий и Марс - на вечерней заре. Венера и Нептун не видны...</div>
                </div>

            </div>

            <div class="block">

                <div > <img class="img-block" src="img/2event.jpg"> </div>
                <div class="text-block">
                    <div class="event-name">Звездопад</div>
                    <div class="event-creator">&nbsp;</div>
                    <div class="event-content">Ежегодно в середине декабря на ночном небе наблюдается самый обильный звездопад северного неба Геминиды. Это происходит потому, что планета Земля в декабре проходит через рой мелких частиц, выброшенных в космос бывшей когда-то кометы, а ныне астероида, 3200 Фаэтон. Наиболее плотную часть облака наша планета проходит в ночь с 13 на 14 декабря...</div>
                </div>

            </div>
            <div class="block">

                <div > <img class="img-block" src="img/3event.jpg"> </div>
                <div class="text-block">
                    <div class="event-name">Пылевые облака</div>
                    <div class="event-creator">новость добавил Mihail@1988</div>
                    <div class="event-content">Звездообразная галактика М82 (галактика &quot;сигара&quot;) одна из наиболее изученных галактик ночного неба. Известно, что M82 — это неправильная галактика. Также считается, что на неё сильно повлиял &quot;недавний&quot; пролёт мимо (своей соседки),большой спиральной галактики M81...</div>
                </div>

            </div>
            <div class="block">

                <div > <img class="img-block" src="img/4event.jpg"> </div>
                <div class="text-block">
                    <div class="event-name">Комета</div>
                    <div class="event-creator">новость добавил Mihail@1988</div>
                    <div class="event-content">  Эти волокна растянулись в пространстве более чем на 10 000 световых лет. Галактика Сигара лежит на расстоянии 12 миллионов световых лет от нас. Она является самой яркой галактикой в инфракрасном спектре звездного неба. В видимом свете её можно найти с помощью маленького телескопа в направлении на созвездие Большой Медведицы...</div>
                </div>
            </div-->
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
