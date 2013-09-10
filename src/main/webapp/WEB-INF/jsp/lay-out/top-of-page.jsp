<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div id="top-line">
    <div id="top-container" class="top-container centr">
         <a id="main-href" href="index.html">
            <div id="logo">
                <img src="/space_adventures/resources/img/logo.png" alt="logo">
            </div>
        </a>


            <form:form commandName="searchEventForm" id="search">
                <form:input path="email" type="text" id="search-text" placeholder="Поиск..."/>        </form:form>
                <form:input type="submit" id="search-button" value=""/>
            </form:form>


        <div id="top-menu">
        </div>
    </div>
</div>
<p id="back-top">
    <a href="#top">
    <span><br>ВВЕРХ</span>
    </a>
</p>
<div id="single-container" class="container centr">
    <header>
        <div id="header-text">Узнавай о событиях космоса и спеши наблюдать</div>
        <span id="please-subs">Подпишись на рассылку и получай информацию о надвигающихся событиях космоса.</span>
        <div>
            <button id="subs-button"> Подписка на рассылку</button>
        </div>
    </header>
<div id="subscribe-form-div"> </div>
<div id="error"> </div>