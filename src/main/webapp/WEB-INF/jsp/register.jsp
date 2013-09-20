<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <script src="/space_adventures/resources/js/close-button.js"> </script>
        <script src="/space_adventures/resources/js/submit-register.js"> </script>
    </head>

    <body>
        <form:form commandName="registrationForm" id="subscribe-form" action="register.html">
            <div>
                <div id="form-name"> <label>Регистрация</label> </div>  <div id="close"> x </div>

                <div id="form-content">
                    <form:input path="username" placeholder="Введите своё имя" class="popup-form-input-head" />
                    <form:input path="email" placeholder="Введите свой e-mail" class="popup-form-input" />
                    <form:input path="password" placeholder="Введите пароль" class="popup-form-input" type="password" />
                    <form:input path="confirmPassword" placeholder="Повторите пароль" class="popup-form-input" type="password" />
                </div>

                <div class="form-error">
                    <form:errors path="username" />
                    <form:errors path="email" />
                    <form:errors path="password" />
                    <form:errors path="confirmPassword" />
                </div>

                <div id="subscr-button-div">
                    <input type="submit" id ="submit-button-subscribe" value="Зарегистрироваться"/>
                </div>
            </div>
        </form:form>
    </body>
</html>
