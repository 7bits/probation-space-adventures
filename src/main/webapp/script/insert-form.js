$(document).ready(function(){


$('#close').click(function(){
        $("#subscribe-form").css("visibility", "hidden");
        $("#dark-bg").remove();
    });


    $("#subs-button").click(function(event){
        doAjaxPost();
    })
})

function doAjaxPost() {
    $.ajax({
        type: "GET",
        url: "/space_adventures/subscribe-form.html",
        success: function(data){
            // Now you have your HTML in "data", do whatever you want with it here in this function
            $('#subscribe-form-div').html(data);
        },
        error: function(e){
            alert('Ошибка. Всё плохо. Иди домой.');
        }
    })
}