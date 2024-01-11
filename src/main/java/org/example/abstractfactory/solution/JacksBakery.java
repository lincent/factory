package org.example.abstractfactory.solution;

import org.example.Cake;
import org.example.CakeTypes;
import org.example.abstractfactory.solution.cakes.Brownie;
import org.example.abstractfactory.solution.cakes.LemonDrizzle;
import org.example.abstractfactory.solution.ingredientstores.IngredientFactory;

public class JacksBakery extends Bakery {
  private final IngredientFactory ingredientFactory;

  public JacksBakery(IngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public Cake getRecipe(CakeTypes cake) {
    if (cake.equals(CakeTypes.Brownies))
    {
      return new Brownie(ingredientFactory);
    }
    else if (cake.equals(CakeTypes.LemonDrizzle))
    {
      return new LemonDrizzle(ingredientFactory);
    }

    return null;
  }

  @Override
  public String getName() {
    return "Jack";
  }
}
