'use strict';

/**
 * @ngdoc function
 * @name clientApp.controller:UsuariosCtrl
 * @description
 * # UsuariosCtrl
 * Controller of the clientApp
 */
 var app = angular.module("clientApp", []);

  app.controller("UsuariosCtrl", function ($scope) {
  $scope.usuarios = [
    {
      "nombre": 'carlos1',
	  "contrasena": 'duhf',
	  "telefono": '1234',
	  "correo": 'correo1'
    },
    {
      'nombre': 'carlos2',
	  'contrasena': 'duhf',
	  'telefono': '2222',
	  'correo': 'correo2'
    },
    {
      
      'nombre': 'carlos3',
	  'contrasena': 'duhf',
	  'telefono': '3333',
	  'correo': 'correo3'
    }
  ];
  
  //$scope.usuarios = usuario.getList().$object;
});