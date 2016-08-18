'use strict';
//Ingenieria de software
//Juan Carlos Tapia 14133
//Rodrigo Castro 14092
//Leonel Guillen 14451
//Hugo Noriega 14097

/**
 * @ngdoc overview
 * @name clientApp
 * @description
 * # clientApp
 *
 * Main module of the application.
 */

angular
  .module('clientApp', [
    'ngRoute', 'appRoutes',
	'restangular'
  ])
  .config(function ($routeProvider, RestangularProvider) {
	RestangularProvider.setBaseUrl('http://localhost:3000');
    $routeProvider
      .when('/usuarios', {
        templateUrl: 'views/usuarios.html',
        controller: 'UsuariosCtrl'
      })
      .otherwise({
        redirectTo: '/'
      });
  })
  .factory('UsuarioRestangular', function(Restangular) {
  return Restangular.withConfig(function(RestangularConfigurer) {
    RestangularConfigurer.setRestangularFields({
		id: '_id'
		});
	});
	})
	.factory('Usuario', function(UsuarioRestangular) {
		return UsuarioRestangular.service('usuario');
	});
