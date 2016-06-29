

myApp = angular.module('mainApp', ['ngRoute']);

 myApp.config(function($routeProvider) {
 	$routeProvider
 	.when('/',{
 		templateUrl: 'login.html'
 	})
    .when('/admindashboard',{
        templateUrl: 'admindashboard.html'
    })
    .when('/trainerdashboard',{
    templateUrl: 'tdashboard.html'
    })
    .when('/dashboard',{
        templateUrl: 'dashboard.html'
    })
    .otherwise({
 		redirectTo:'/'
 	});
 });

 myApp.controller('loginController', function($scope,$http,$location)
 {
 	$scope.authenticateUser = function () {
 		var User = { username: $scope.tm.login.username, password: $scope.tm.login.password};
        /*console.log("User Obj = " +this.User);*/
 		$http(
				{   method:'POST',
					url:"http://localhost:9090/springmvchibernate/login",
					data: User,
					headers: {'Content-Type' : 'application/json'}
				}
			).success(function(data,status,headers,config) 
				{
            console.log("Success");
            console.log("EmpType: "+data.empType);
		 	if(data.empType=='TrainingExecutive')
                $location.path("/admindashboard");
            else if(data.empType=='Trainer')
                $location.path("/trainerdashboard");
            else if(data.empType=='Employee')
                $location.path('/dashboard');
            else 
                $location.path('/')
                
		 }).error(function(data,status,headers,config) 
         {
                console.log("error occured")
		 	    $location.path('/')
        });
    }
});

myApp.controller('delController',function($scope,$http,$location)
				 {
	$scope.deleteTraining = function(){
			alert("I got executed");
			$http(
			{
				method: 'POST',
				url:"http://localhost:9090/springmvchibernate/delete",
				data : $scope.training,
				headers :{'Content-Type' : 'application/json'}
			
			}
				).success(function(data,status,headers,config)
			{
			console.log("Delete Training controller");
			console.log();
				
		}).error(function(data,status,headers,config)
				 {
			console.log("error");
			$location.path('/')
			
		});
		
	}
});



myApp.controller('showTrainings',function($scope,$http,$location)
				 
				 {
	$scope.ViewTrainings = function(){
		alert("viewtrng got executed")
		$http(
		{
			method: 'GET',
			url:"http://localhost:9090/springmvchibernate/showtable",
			data: '',
			headers: {'Content-Type' : 'application/json'}
		}
		).success(function(data,status,headers,config)
		{
			console.log("delete training controller ");
					
		}).error(function(data,status,headers,config)
				 {
			console.log("error in delete training controller");
			$location.path('/');
		});
	}
});