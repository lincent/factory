package org.example.abstractfactory.solution;

import org.example.Cake;
import org.example.CakeTypes;

public abstract class Bakery {
  public void orderCake(CakeTypes type)
  {
    Cake cake = getRecipe(type);

    if (cake == null)
    {
      System.out.printf("Sorry, %s can't bake a %s", getName(), type);
      return;
    }

    cake.getIngredients();
    cake.mixIngredients();
    cake.putIngredientsInTin();
    cake.bake();
  }

  public abstract Cake getRecipe(CakeTypes type);

  public abstract String getName();
}
