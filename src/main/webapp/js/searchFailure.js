$(document).ready(function() {
/*a=$('#content').html();      /*
  alert ("-"+a+"-"+a.length);     */
  //содержание
  if (!($("div").is(".event-name"))){
  $("#content").html("<a href='index.html' class='search-failure'><div id='event-block' class='block'><div id='search-failure-text' >Не найдено контента, удовлетворяющего условиям поиска.  <br> Нажмите, для возврата на главную страницу</div></div></a>")
  }
});
