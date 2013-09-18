<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<script src="/space_adventures/resources/js/close-button.js"> </script>

<form:form commandName="registrationForm" id="subscribe-form" action="register.html">
    <div>
        <div id="form-name"> <label>Регистрация</label> </div>  <div id="close"> x </div>
        <div id="form-content">
            <form:input path="username" placeholder="Введите своё имя" class="popup-form-input-head" />
            <form:input path="email" placeholder="Введите свой e-mail" class="popup-form-input" />
            <form:input path="password" placeholder="Введите пароль" class="popup-form-input" type="password" />
            <form:input path="password2" placeholder="Повторите пароль" class="popup-form-input" type="password" />
        </div>

        <div id="subscr-button-div">
            <input type="submit" id ="submit-button-subscribe" value="Зарегистрироваться"/>
        </div>
    </div>
</form:form>
