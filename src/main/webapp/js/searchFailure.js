$(document).ready(function() {
a=$('#content').html();      /*
  alert ("-"+a+"-"+a.length);     */

  if (a.length<28){

  $("#content").html("<a href='index.html' class='search-failure'><div id='event-block' class='block'><div id='search-failure-text' >Не найдено контента, удовлетворяющего условиям поиска.  <br> Нажмите, для возврата на главную страницу</div></div></a>")
  }
});
