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
          alert("Спасибо за подписку")
           $('#subscribe-form-div').empty();

     } else {
            $('#subscribe-form-div').empty();
             $('#subscribe-form-div').html(responseText);
     }
      $("#dark-bg").css("visibility", "hidden");
  }


