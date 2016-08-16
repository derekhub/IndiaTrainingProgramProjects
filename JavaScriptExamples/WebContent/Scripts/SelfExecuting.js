/**
 * 
 */

var myfunction = function() {
	
	alert("Hi im from anon function");
	
};

(function(){
	
	myfunction();
	alert("hi from self executing anonymous functions");
	
	
})();


