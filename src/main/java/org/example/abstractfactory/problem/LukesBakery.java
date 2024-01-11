package org.example.abstractfactory.problem;

import org.example.Cake;
import org.example.CakeTypes;
import org.example.abstractfactory.problem.cakes.Brownie;

public class LukesBakery extends Bakery {
  @Override
  public Cake getRecipe(CakeTypes type) {
    if (type.equals(CakeTypes.Brownies))
    {
      return new Brownie();
    }

    return null;
  }

  @Override
  public String getName() {
    return "Luke";
  }
}
