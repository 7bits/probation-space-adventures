$(document).ready(function(){


$('#close').click(function(){
    closePost();

    $("#dark-bg").css("visibility", "hidden");


    });

})

function closePost() {
    $.ajax({
        type: "GET",
        url: "/space_adventures/subscribe-form.html",
        success: function(data){
            // Now you have your HTML in "data", do whatever you want with it here in this function
            $('#subscribe-form-div').empty();
        },
        error: function(e){
            alert('Ошибка close-buttom. Всё плохо. Иди домой.');
            $("#dark-bg").css("visibility", "hidden");
        }
    })
}