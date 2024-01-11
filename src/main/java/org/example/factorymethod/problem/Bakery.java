package org.example.factorymethod.problem;

import org.example.CakeTypes;
import org.example.factorymethod.cakes.Brownie;
import org.example.Cake;
import org.example.factorymethod.cakes.CoffeeAndWalnut;
import org.example.factorymethod.cakes.Muffins;
import org.example.factorymethod.cakes.VictoriaSponge;

public class Bakery {
  public void orderCake(CakeTypes type)
  {
    Cake cake = null;
    if (type.equals(CakeTypes.Muffins))
    {
      cake = new Muffins();
    }
    else if (type.equals(CakeTypes.Brownies))
    {
      cake = new Brownie();
    }
    else if (type.equals(CakeTypes.CoffeeAndWalnut))
    {
      cake = new CoffeeAndWalnut();
    }
    else if (type.equals(CakeTypes.VictoriaSponge))
    {
      cake = new VictoriaSponge();
    }

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
