package org.example.factorymethod.maybe;

import org.example.Cake;
import org.example.CakeTypes;

public class Bakery {
  private final RecipeBook recipes = new RecipeBook();
  public void orderCake(CakeTypes type)
  {
    Cake cake = recipes.getRecipe(type);

    if (cake == null)
    {
      System.out.printf("Sorry, can't bake a %s%n", type);
      return;
    }

    cake.getIngredients();
    cake.mixIngredients();
    cake.putIngredientsInTin();
    cake.bake();
  }
}
