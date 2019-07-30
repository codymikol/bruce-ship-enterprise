(function () {
    angular.module('bruceApp').component('dashboardContainer', {
        templateUrl: '/dashboard/dashboard.html',
        controller: 'DashboardController',
        bindings: {
            clients: '<',
            versions: '<'
        }
    })
})();