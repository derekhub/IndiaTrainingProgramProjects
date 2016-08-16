/**
 * 
 */

(function() {

var models = ["LCD TV", "Air Conditioner"];
var description = ["Images/logo.png", "Images/logo.png"];
var colors = ["black", "red"];


	for(i=0; i<2; i++){
		var element = document.getElementsByTagName("img")[i];
		element.setAttribute('src', description[i]);

		var headElement = document.getElementsByTagName("h1")[i];
		headElement.innerHTML = models[i];
		
        var colorElement = document.getElementsByTagName("p")[i];
        colorElement.innerHTML = colors[i];
		

		
	}
})();
