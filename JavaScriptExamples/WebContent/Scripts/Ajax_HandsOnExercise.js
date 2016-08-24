/**
 * 
 */

(function(){

$.ajax({
      async: true,
      type: "GET",
      url: "http://services.groupkt.com/state/get/ind/all",
      dataType: "json"
    }).done(function(result) {

    var arrayOfResult = result.RestResponse.result;
 
      $.each(arrayOfResult, function(index, value) {
    	  
        if (index === 0) {
        	
          var option = "<option value='"+ value.capital +"' selected='selected'>"+ value.name +"</option>"
          $('#value').val(value.capital);
          
        } else {
        	
          var option = "<option value='"+ value.capital +"'>"+ value.name +"</option>"
          
        }
 
        $('#state').append(option);
        
        
      });
 
      $('#state').on('change', function() {
        $('#value').val($('option:selected').val());
        
      });
      
    }).fail(function() {
      alert("ERROR");
      
    });

})();







