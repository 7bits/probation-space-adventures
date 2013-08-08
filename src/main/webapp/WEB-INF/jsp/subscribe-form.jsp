<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <script src="/space_adventures/resources/script/close-button.js"> </script>
     <script src="/space_adventures/resources/script/jquery.form.js"> </script>
     <script src="/space_adventures/resources/script/form-actions.js"> </script>

<form:form commandName="subscribeForm" id="subscribe-form" action="index.html">
    <div>
        <div id="form-name"> <label>Подписка на рассылку</label> </div>  <div id="close"> x </div>
        <div id="form-content"> <img src="img/mail.png">
            <form:input path="email" placeholder="Введите свой e-mail" id="email-input" class="formSpace"/>
         <div id="error-message"> <form:errors path="email"/> </div>
        </div>

        <div id="subscr-button-div"> <input type="submit" id ="submit-button-subscribe" value="Подписаться"/></div>
    </div>
</form:form>

