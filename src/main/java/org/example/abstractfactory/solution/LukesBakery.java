package org.example.abstractfactory.solution;

import org.example.Cake;
import org.example.CakeTypes;
import org.example.abstractfactory.solution.cakes.Brownie;
import org.example.abstractfactory.solution.ingredientstores.IngredientFactory;

public class LukesBakery extends Bakery {
  private final IngredientFactory ingredientFactory;

  public LukesBakery(IngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public Cake getRecipe(CakeTypes type) {
    if (type.equals(CakeTypes.Brownies))
    {
      return new Brownie(ingredientFactory);
    }

    return null;
  }

  @Override
  public String getName() {
    return "Luke";
  }
}
