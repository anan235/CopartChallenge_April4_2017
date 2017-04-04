var app = angular.module("listViewApp", []);

// Angular controller to load recipe values
app.controller("listCtrl", function($scope, $http, RecipeIngredients) {
    
    // Access cache data or sent http request 
    $scope.loadRecipe = function(){
        if(!RecipeIngredients.isLoaded){
            return RecipeIngredients.getIngredients();
        }else{
            return RecipeIngredients;
        }
    }
    $scope.recipe = $scope.loadRecipe();
});

// Component for adding list to allow for nested lists
angular.module("listViewApp").component('ingredient',{
    templateUrl: 'list_item.html',
    bindings: {
     data: '='
   }
});

// Factory to cache values
app.factory('RecipeIngredients', function($http) {
  self = this;
  this.isLoaded = false;
  this.ingredients;

  // This is called when data is not loaded
  this.getIngredients = function() {
      $http.get('RecipeJSON.json')
        .success(function(data, status, headers, config) {
            self.ingredients = data;
            self.isLoaded = true;
        });
      return self;
  };
  return self;
})