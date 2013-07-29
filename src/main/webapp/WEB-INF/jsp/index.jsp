<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<link media="screen" rel="stylesheet" href="${resourceUrl}/style.css" type="text/css" />
<html>
    <head>
        <meta charset="utf-8">
        <title>Main</title>
        <link href='http://fonts.googleapis.com/css?family=PT+Sans' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/style.css" type="text/css" media="screen" />
    </head>
    <body>
        <a href="javascript:scroll(0,0)" ><div id="go-top"> </div> </a>
        <div id="top-line">
            <div id="top-container" class="top-container centr">
                <div id="logo"> Space adventure </div>
                <div id="top-menu">
                    Главная	 &nbsp;&nbsp;&nbsp;&nbsp;
                    Добавить событие &nbsp;&nbsp;&nbsp;&nbsp;
                    Регистрация &nbsp;&nbsp;&nbsp;&nbsp;  Вход
                </div>
            </div>
        </div>
        <div id="container" class="container centr">
            <header>
                <div id="zagolovok">Узнавай о событиях космоса и спеши наблюдать</div>
                <span id="please-subs">
                    Подпишись на рассылку и получай информацию о надвигающихся событиях космоса.
                </span>
                <div>
                    <button id="subs-button"> Подписка на рассылку</button>
                </div>
            </header>
            <!--<div id="filtr">-->
                <!--<div id="admin" title="Вывести сообщения добавленные админом">-->
                    <!-- <input type="checkbox" name="filtr" value="admin">  -->
                <!-- </div>
                <!--<div id="user" title="Вывести сообщения добавленные пользователем"> -->
                    <!-- <input type="checkbox" name="filtr" value="user" > -->
                <!-- </div>-->
            <!--</div>-->
            <div id="search-block">
                <form name="search-form" action="search-form" >
                    <input id="search" name="search" type="search" placeholder="поиск по событиям...">
                        <button id="search-button"> Поиск </button>
                </form>
            </div>
            <div id="content">
                <div class="block">
                    <div > <img class="img-block" src="img/1event.jpg"> </div>
                    <div class="text-block">
                        <div class="event-name">Астероид</div>
                        <div class="event-creator">новость добавил Mihail@1988</div>
                        <div class="evenr-conent">
                            На этой неделе Меркурий достигнет наибольшей вечерней элонгации в 18°, а главным событием
                            неба станет близкий пролет околоземного астероида 2012 DA14 (+7m) в ночь с 15 на 16 февраля.
                             Сатурн наблюдаются на ночном и утреннем небе, Юпитер виден с вечера до ночи, Уран - на
                             вечернем небе, а Меркурий и Марс - на вечерней заре. Венера и Нептун не видны...
                        </div>
                    </div>
                </div>
                <div class="block">
                    <div > <img class="img-block" src="img/2event.jpg"> </div>
                    <div class="text-block">
                        <div class="event-name">Звездопад</div>
                        <div class="event-creator">&nbsp;</div>
                        <div class="evenr-conent">
                            Ежегодно в середине декабря на ночном небе наблюдается самый обильный звездопад северного
                            неба Геминиды. Это происходит потому, что планета Земля в декабре проходит через рой мелких
                            частиц, выброшенных в космос бывшей когда-то кометы, а ныне астероида, 3200 Фаэтон. Наиболее
                             плотную часть облака наша планета проходит в ночь с 13 на 14 декабря...
                        </div>
                    </div>
                </div>
                <div class="block">
                    <div > <img class="img-block" src="img/3event.jpg"> </div>
                    <div class="text-block">
                        <div class="event-name">Пылевые облака</div>
                        <div class="event-creator">новость добавил Mihail@1988</div>
                        <div class="evenr-conent">
                            Звездообразная галактика М82 (галактика &quot;сигара&quot;) одна из наиболее изученных
                            галактик ночного неба. Известно, что M82 — это неправильная галактика. Также считается, что
                            на неё сильно повлиял &quot;недавний&quot; пролёт мимо (своей соседки),большой спиральной
                            галактики M81...
                        </div>
                    </div>

                </div>
                <div class="block">

                    <div > <img class="img-block" src="img/4event.jpg"> </div>
                    <div class="text-block">
                        <div class="event-name">Комета</div>
                        <div class="event-creator">новость добавил Mihail@1988</div>
                        <div class="evenr-conent">
                            Эти волокна растянулись в пространстве более чем на 10 000 световых лет. Галактика Сигара
                            лежит на расстоянии 12 миллионов световых лет от нас. Она является самой яркой галактикой в
                            инфракрасном спектре звездного неба. В видимом свете её можно найти с помощью маленького
                            телескопа в направлении на созвездие Большой Медведицы...
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--<div id="footer">
            <div id="top-container" class="top-container centr">
                <div id="logo">  Space adventure </div>
                <div id="top-menu">
                    copyright (c)       |       contacts
                </div>
            </div>
        </div>-->
    </body>
</html>