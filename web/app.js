/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
var app = angular.module('appconsultar', []);
app.controller('controladorconsulta', ['$scope', '$http', function ($scope,$http ){
        
        //$scope.nombre = "jonathan balcazar"; $scope seria como el body en html
        $http({
            params: 'consultarCampo',
            method : 'GET',
            url = '/FormularioCRUD'    
        }).then(function(data){
            $scope.Formulariosolicitud= data.data;
        }).catch (function(err){
            console.log(err.data);
        }); 



        
        
        
        
}]);

