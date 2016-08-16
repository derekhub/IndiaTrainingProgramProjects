/**
 * 
 */

var item = {
	
	itemNumber : 101,
	itemName : "tv",
	
	showItem:function(){
		return this.itemName.toUpperCase();
	}
	
};

function product(){
	
	this.name="laptop";
	this.price=45000;
	this.showDetails = function(){
		return this.name + ":" + this.price;
	}
};

function salesMan(name, code){
	this.name = name;
	this.code = code;
	
	this.showSalesman = function(){
		return this.name;
	}
	
};

(function(){
	
	document.writeln(item.itemNumber);
	document.writeln(item.itemName);
	document.writeln(item.showItem());
	
	var pr = new product();
	
	document.writeln(pr.name);
	document.writeln(pr.price);
	document.writeln(pr.showDetails());
	
	
	var sMan = new salesMan("Derek", "DC123")
	
	document.writeln(sMan.name);
	document.writeln(sMan.code);
	document.writeln(sMan.showSalesman());


	
	
})();

