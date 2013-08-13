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
            $('#subscribe-form-div').empty();
        },
        error: function(e){
            alert('Ошибка доступа к subscribe-form.html через closePost().');
        }
    })
}