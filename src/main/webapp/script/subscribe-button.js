$(document).ready(function(){
		

		
		
		$('#subs-button').click(function(){
			$("#subscribe-form").css("visibility", "visible"); 
			$("#subscribe-form").css("z-index", "45"); 

			$('<div id="dark-bg" style="position: absolute; z-index:40; opacity:0.2"></div>').insertBefore('body');  
			$('#dark-bg').css({  
				height: $(document).height(),  
				width:  $(document).width(),  
				background: 'black'  
				}).fadeTo('fast', '0.4');  
           	});
		
		
		$("#submit-button-subscribe").click(function(event){

			//event.preventDefault();
			$("#subscribe-form").css("visibility", "hidden");
			$('#dark-bg').remove();
			
		})
		
		
		
})	
