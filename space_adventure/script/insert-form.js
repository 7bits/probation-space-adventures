$(document).ready(function(){
    $("#subs-button").click(function(event){
        doAjaxPost();


        $('<div id="dark-bg" style="position: absolute; z-index:20; opacity:0.2"></div>').insertBefore('body');
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

