<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div id="top-line">
    <div id="top-container" class="top-container centr">
         <a id="main-href" href="index.html">
            <div id="logo">
                <img src="/space_adventures/resources/img/logo.png" alt="logo">
            </div>
        </a>
        
        <div id="security-nav">
            <sec:authorize access="isAnonymous()">
                <a id="register-href" href="<c:url value="/register.html" />" > Регистрация</a>
                <a id="signin-href" href="<c:url value="/signin.html" />" > Вход</a>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <a href="<c:url value="/user.html" />" > User: <sec:authentication property="principal.username" /></a>
                <a href="<c:url value="/j_spring_security_logout" />" > Выход</a>
            </sec:authorize>
        </div>

        <form:form commandName="searchEventForm" id="search" method="GET" action="index.html">
            <form:input path="query" placeholder="Поиск..." id="search-text"/>
            <input type="submit" id="search-button" value=""/>
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