
var app = angular.module('myApp2', ['ngRoute']);

app.config(function($routeProvider) {
  $routeProvider

  .when('/', {
    templateUrl : 'c_about/view/home.html',
    controller : 'home'
   
  })

  .when('/contact', {
    templateUrl : 'c_contact/view/contact.html',
    controller : 'contact'
   
  })
  .when('/aboutus', {
    templateUrl : 'c_aboutus/view/aboutus.html',
    controller : 'aboutus'
   
  })
  
   .when('/register', {
    templateUrl : 'c_register/view/job.html',
    controller : 'register'
   
  })

  .otherwise({redirectTo: '/'});
});

