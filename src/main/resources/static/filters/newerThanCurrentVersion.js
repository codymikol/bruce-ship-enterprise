angular.module('bruceApp').filter('newerThanCurrentVersion', function () {
    return function (input, current) {

        return input.reduce(function (col, item) {

            if(col[1]) {
                col[0].push(item)
            }

            if (item.versionNumber === current) {
                col[1] = true;
            }

            return col;

        }, [[], false])[0];

    }
});