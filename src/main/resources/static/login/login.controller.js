(function () {

angular
    .module('bruceApp')
    .controller('LoginController', LoginController);

    function LoginController() {

        this.test = 'The login page!';

    }

})();