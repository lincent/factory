package org.example.abstractfactory.problem;

import org.example.Cake;
import org.example.CakeTypes;
import org.example.abstractfactory.problem.cakes.Brownie;
import org.example.abstractfactory.problem.cakes.LemonDrizzle;

public class JacksBakery extends Bakery {
  @Override
  public Cake getRecipe(CakeTypes cake) {
    if (cake.equals(CakeTypes.Brownies))
    {
      return new Brownie();
    }
    else if (cake.equals(CakeTypes.LemonDrizzle))
    {
      return new LemonDrizzle();
    }

    return null;
  }

  @Override
  public String getName() {
    return "Jack";
  }
}
