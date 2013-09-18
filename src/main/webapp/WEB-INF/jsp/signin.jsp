<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="true"%>

<script src="/space_adventures/resources/js/close-button.js"> </script>

<html>
<head>
<title>Sign In</title>
</head>
<body>
	<form class="login-form" id="subscribe-form" action="j_spring_security_check" method="post">
	    <div id="form-name"> <label>Вход</label> </div>  <div id="close"> x </div>
	    <div id="form-content">
		 	<input id="j_username" name="j_username" size="20" maxlength="50" type="text" placeholder="Введите своё имя" />

			<input id="j_password" name="j_password" size="20" maxlength="50" type="password" placeholder="Введите свой пароль" />
	    </div>
	    <div id="subscr-button-div">
            <input type="submit" id ="submit-button-subscribe" value="Войти"/>
        </div>
	</form>
</body>
</html>
