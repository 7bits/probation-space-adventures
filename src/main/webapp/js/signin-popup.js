$(document).ready(function() {

    $("#signin-href").click(function() {

        event.preventDefault();
        setDarkBg();
        getSigninForm();
    });

    $("#register-href").click(function() {

        event.preventDefault();
        setDarkBg();
        getRegisterForm();
    });
});

function getSigninForm() {

    $.ajax({
        type: "GET",
        url: "signin.html",
        success: function(data) {
            $('#subscribe-form-div').html(data);
        },
        error: function(e) {
            alert('Ошибка доступа к signin.html через insert-form.');
            $("#dark-bg").css("visibility", "hidden");
        }
    });
}

function getRegisterForm() {

    $.ajax({
        type: "GET",
        url: "register.html",
        success: function(data) {
            $('#subscribe-form-div').html(data);
        },
        error: function(e) {
            alert('Ошибка доступа к register.html через insert-form.');
            $("#dark-bg").css("visibility", "hidden");
        }
    });
}

function setDarkBg() {

    $('<div id="dark-bg"></div>').insertBefore('body');
    $('#dark-bg').css({
        height: $(document).height(),
        width:  $(document).width(),
        background: 'black'
    }).fadeTo('fast', '0.4');
    $("#dark-bg").css("visibility", "visible").fadeTo('fast', '0.4');
}
