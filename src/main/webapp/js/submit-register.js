$(document).ready(function() {

    var options = {
        success: showResponse
    };
    $('#subscribe-form').ajaxForm(options);
});

function showResponse(responseText, statusText, xhr, form) {

    console.log(responseText);

    if (responseText.length == 0) {

        $('<div id="subscribe-notification"> <div id="subscribe-notification-text"> Регистрация прошла успешно </div> </div>').insertBefore('body');
        $("#subscribe-notification").css("visibility", "visible").fadeTo('fast', '1');
        setTimeout(function() {
            $("#dark-bg").css("visibility", "hidden");
            $("#subscribe-notification").css("visibility", "hidden").fadeOut('slow', '0');
        }, 1000);
        $('#subscribe-form-div').empty();

    } else {
        $('#subscribe-form-div').empty();
        $('#subscribe-form-div').html(responseText);
    }
}

//$(document).ready(function() {
//
//    $('#submit-button-subscribe').click(function() {
//
//        event.preventDefault();
//        send();
//    });
//});
//
//function send() {
//
//    var formdata = $('#subscribe-form').serialize();
//
//    $.ajax({
//
//        url: 'register.html',
//        type: 'post',
//        data: formdata,
//        success: function(data) {
//
//            $('#subscribe-form-div').empty();
//            $('#subscribe-form-div').html(data);
//        },
//        error: function(e) {
//
//            alert('Ошибка доступа к register.html через insert-form.');
//            $("#dark-bg").css("visibility", "hidden");
//        }
//    });
//}
