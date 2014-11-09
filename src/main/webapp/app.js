function Hello($scope, $http) {
    $http.get('http://54.72.196.42/carsales-1.0/ws/v/1/rest/AutoService/getAutoById/16').
        success(function(data) {
            $scope.greeting = data;
        });
}

