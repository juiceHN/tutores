//Universidad del Valle de Guatemala
//Ingenieria de Software
//Sprint 3
//Hugo Noriega
//Rodrigo Castro
//Juan Carlos Tapia
//Leonel Guillen

(function () {
    
    
    
    'use strict';

    angular
        .module('app')
        .controller('Home.IndexController', Controller);

    function Controller(UserService) {
        var vm = this;

        vm.user = null;

        initController();

        function initController() {
            
            
            //Usuario actual logueado
            UserService.GetCurrent().then(function (user) {
                //Almacenar usuario
                vm.user = user;
            });
        }
    }

})();
