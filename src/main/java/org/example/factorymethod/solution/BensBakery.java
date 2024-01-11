package org.example.factorymethod.solution;

import org.example.Cake;
import org.example.CakeTypes;
import org.example.factorymethod.cakes.CoffeeAndWalnut;
import org.example.factorymethod.cakes.Muffins;
import org.example.factorymethod.cakes.VictoriaSponge;

public class BensBakery extends Bakery {
  @Override
  public Cake getRecipe(CakeTypes cake)
  {
    if (cake.equals(CakeTypes.Muffins)) {
      return new Muffins();
    }
    else if (cake.equals(CakeTypes.CoffeeAndWalnut)) {
      return new CoffeeAndWalnut();
    }
    else if (cake.equals(CakeTypes.VictoriaSponge)) {
      return new VictoriaSponge();
    }

    return null;
  }

  @Override
  public String getName() {
    return "Ben";
  }
}
