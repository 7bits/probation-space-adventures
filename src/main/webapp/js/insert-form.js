$(document).ready(function(){
    $("#subs-button").click(function(event){
        doAjaxPost();

        $('<div id="dark-bg"></div>').insertBefore('body');
            $('#dark-bg').css({
                    height: $(document).height(),
                    width:  $(document).width(),
                    background: 'black'
            }).fadeTo('fast', '0.4');
        $("#dark-bg").css("visibility", "visible").fadeTo('fast', '0.4');
    })
})

function doAjaxPost() {
    $.ajax({
        type: "GET",
        url: "subscribe-form.html",
        success: function(data){
            $('#subscribe-form-div').html(data);
        },
        error: function(e){
            alert('Ошибка доступа к subscribe-form.html через insert-form.');
            $("#dark-bg").css("visibility", "hidden");
        }
    })
}

