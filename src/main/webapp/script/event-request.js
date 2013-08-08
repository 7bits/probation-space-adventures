$(document).ready(function(){
    $('#event-block').click(function(){
        eventRequest();
    })
}
    eventRequest(){
        $.ajax({
            type: "GET",
            url: "/space_adventures/event.html",
            success: function(data){
                // Now you have your HTML in "data", do whatever you want with it here in this function
                //$('#subscribe-form-div').empty();
                alert('Отправил-получил');
            },
            error: function(e){
                alert('Отправил-неполучил');
            }
        })
    }