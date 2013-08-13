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
                //$('#subscribe-form-div').empty();
                alert('Отправил-получил');
            },
            error: function(e){
                alert('Отправил-неполучил');
            }
        })
    }