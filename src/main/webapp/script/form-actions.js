  // prepare the form when the DOM is ready
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
  //  body.insertBefore($('<div id="subscribe-notification"> ffffffff </div>'), refNode)
    $('<div id="subscribe-notification"> Подписка прошла успешно </div>').insertBefore('body');
    $("#subscribe-notification").css("visibility", "visible").fadeTo('fast', '1');

    $('#subscribe-form-div').empty();
    $("#dark-bg").css("visibility", "hidden");



 } else {
    $('#subscribe-form-div').empty();
    $('#subscribe-form-div').html(responseText);
 }
}


