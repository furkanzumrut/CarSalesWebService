function Hello($scope, $http) {
    $http.get('http://localhost:8080/carsales/ws/rest/AutoService/getAutoById/16').
        success(function(data) {
            $scope.greeting = data;
        });
}

var app = angular.module('myApp', ['ngGrid']);
app.controller('MyCtrl', function($scope) {
    $scope.myData = [{name: "Moroni", age: 50},
                     {name: "Tiancum", age: 43},
                     {name: "Jacob", age: 27},
                     {name: "Nephi", age: 29},
                     {name: "Enos", age: 34}];
    $scope.gridOptions = { data: 'myData' };
});