/**
 * 
 */



var app = angular.module("iteration", []);

var projects=[
              
              {'projCode':'EDU101', 'description':'MultiMedia', 'cost':1},
              {'projCode':'EDU102', 'description':'hi', 'cost':2},
              {'projCode':'MED201', 'description':'im', 'cost':3},
              {'projCode':'MED202', 'description':'derek', 'cost':4},
              {'projCode':'ANI301', 'description':'lolol', 'cost':5},
              
              ];

app.controller("projectController", function($scope){
	
	$scope.projectDetails=projects;	
	
	
    $scope.add = function() {
	    
	  var temp = {'projCode':'EDU101', 'description':'MultiMedia', 'cost':1};
	  $scope.projectDetails.push(temp);
	  }
	
	
});

//function add(){
//	
//	var temp = {'projCode':'EDU101', 'description':'MultiMedia', 'cost':1};
//	
//	projects.push(temp);
//};




