package org.example.factorymethod.solution;

import org.example.CakeTypes;
import org.example.factorymethod.cakes.Brownie;
import org.example.Cake;
import org.example.factorymethod.cakes.Muffins;
import org.example.factorymethod.cakes.VictoriaSponge;

public class MaxsBakery extends Bakery{
  @Override
  public Cake getRecipe(CakeTypes cake)
  {
    if (cake.equals(CakeTypes.Muffins)) {
      return new Muffins();
    }
    else if (cake.equals(CakeTypes.Brownies)) {
      return new Brownie();
    }
    else if (cake.equals(CakeTypes.VictoriaSponge)) {
      return new VictoriaSponge();
    }

    return null;
  }

  @Override
  public String getName() {
    return "Max";
  }
}
