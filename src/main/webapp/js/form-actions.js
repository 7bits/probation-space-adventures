$(document).ready(function() {
  var options = {
      success:       showResponse  // post-submit callback
  };
  $('#subscribe-form').ajaxForm(options);
});
// post-submit callback
function showResponse(responseText, statusText, xhr, form)  {
    console.log(responseText);
 if (responseText.length==0)  {

    $('<div id="subscribe-notification"> Подписка прошла успешно </div>').insertBefore('body');  //create notification div in body
    $("#subscribe-notification").css("visibility", "visible").fadeTo('fast', '1'); //show notification div
    setTimeout(function(){
        $("#dark-bg").css("visibility", "hidden"); //hide dark background
        $("#subscribe-notification").css("visibility", "hidden").fadeOut('slow', '0'); //hide notification
    }, 1000);                          //hide after 1000 ms
    $('#subscribe-form-div').empty();

 } else {
    $('#subscribe-form-div').empty(); //delete html from form
    $('#subscribe-form-div').html(responseText);   // write html from subsribe-form.html
 }
}


