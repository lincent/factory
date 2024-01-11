package org.example.factorymethod.maybe;

import org.example.CakeTypes;
import org.example.factorymethod.cakes.Brownie;
import org.example.Cake;
import org.example.factorymethod.cakes.CoffeeAndWalnut;
import org.example.factorymethod.cakes.Muffins;
import org.example.factorymethod.cakes.VictoriaSponge;

public class RecipeBook {
  public Cake getRecipe(CakeTypes cake)
  {
    if (cake.equals(CakeTypes.Muffins))
    {
      return new Muffins();
    }
    else if (cake.equals(CakeTypes.Brownies))
    {
      return new Brownie();
    }
    else if (cake.equals(CakeTypes.CoffeeAndWalnut))
    {
      return new CoffeeAndWalnut();
    }
    else if (cake.equals(CakeTypes.VictoriaSponge))
    {
      return new VictoriaSponge();
    }

    return null;
  }
}
