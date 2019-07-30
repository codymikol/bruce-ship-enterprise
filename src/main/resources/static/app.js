(function () {

    angular.module('bruceApp', [
        'ngAria',
        'ngAnimate',
        'ngMessages',
        'ngMaterial',
        'ui.router'
    ]).config(config);

    function config($stateProvider, $urlRouterProvider) {
        $stateProvider
            .state('login', {
                url: '/login',
                component: 'loginContainer'
            })
            .state('dashboard', {
                component: 'dashboardContainer',
                url: '/dashboard',
                resolve: {
                    clients: function ($http) {
                        return $http.get('/bruce/v1/client');
                    },
                    versions: function ($http) {
                        return $http.get('/bruce/v1/version')
                    }
                }
            });

        $urlRouterProvider.otherwise('/login');

    }

})();
