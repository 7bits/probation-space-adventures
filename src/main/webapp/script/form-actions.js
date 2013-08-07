/*$(document).ready(function() {

     $('#subscribe-form').ajaxForm(function() {
         alert("Thank you for your comment!");
     });
 });
             */

  // prepare the form when the DOM is ready
  $(document).ready(function() {
      var options = {
          //target:        '#output1',   // target element(s) to be updated with server response
          //beforeSubmit:  showRequest,  // pre-submit callback
          success:       showResponse  // post-submit callback

          // other available options:
          //url:       url         // override for form's 'action' attribute
          //type:      type        // 'get' or 'post', override for form's 'method' attribute
          //dataType:  null        // 'xml', 'script', or 'json' (expected server response type)
          //clearForm: true        // clear all form fields after successful submit
          //resetForm: true        // reset the form after successful submit

          // $.ajax options can be used here too, for example:
          //timeout:   3000
      };

      // bind form using 'ajaxForm'
      $('#subscribe-form').ajaxForm(options);
  });


  // post-submit callback
  function showResponse(responseText, statusText, xhr, $form)  {
      // for normal html responses, the first argument to the success callback
      // is the XMLHttpRequest object's responseText property

      // if the ajaxForm method was passed an Options Object with the dataType
      // property set to 'xml' then the first argument to the success callback
      // is the XMLHttpRequest object's responseXML property

      // if the ajaxForm method was passed an Options Object with the dataType
      // property set to 'json' then the first argument to the success callback
      // is the json data object returned by the server

      alert('OK');
  }